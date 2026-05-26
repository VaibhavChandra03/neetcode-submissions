class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build frequency of s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int k = s1.length();

        // Sliding window over s2
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;

            // When window exceeds k, remove leftmost char
            if (i >= k) {
                freq2[s2.charAt(i - k) - 'a']--;
            }

            // Compare arrays only when window size == k
            if (i >= k - 1) {
                if (matches(freq1, freq2)) return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}