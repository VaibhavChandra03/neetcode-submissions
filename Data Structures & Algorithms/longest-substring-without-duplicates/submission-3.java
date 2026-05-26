class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int maxlen = 0;
        int j = 0;
        int len=0;
        for(int i = 0;i<n;i++){
            char curr = s.charAt(i);
            if(mp.containsKey(curr)){
                j = Math.max(j,mp.get(curr)+1);
            }
            len = i-j+1;
            maxlen = Math.max(len,maxlen);
            mp.put(curr,i);
        }

        return maxlen=Math.max(maxlen,len);
    }
}
