
class Solution {
    void groupana(String s, Map<String, List<String>> mp) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder keyBuilder = new StringBuilder();
        for (int count : freq) {
            keyBuilder.append('#').append(count);
        }
        String key = keyBuilder.toString();

        mp.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {
            groupana(s, mp);
        }
        return new ArrayList<>(mp.values());
    }
}