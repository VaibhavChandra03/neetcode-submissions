class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, j=0, n=s.length();
        int[] freq = new int[26];
        int maxfreq = 0; 
        int maxlen = 0;
        while(j<n){
            char curr = s.charAt(j);
            freq[curr-'A']++;
            maxfreq = Math.max(freq[curr-'A'],maxfreq);
            int len = j-i+1;
            if(len-maxfreq<=k)maxlen = Math.max(maxlen,len);
            else{
                freq[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return maxlen;
    }
}
