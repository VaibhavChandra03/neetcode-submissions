class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] freqs1 = new int[26];
        for(char c : s1.toCharArray()){
            freqs1[c-'a']++;
        }

        for(int i=0;i<=s2.length()-s1.length();i++){
            char curr = s2.charAt(i);
            if(freqs1[curr-'a']!=0){
                if(checkperm(i,s1,s2))return true;
            }
        }
        return false;
    }
    public boolean checkperm(int idx, String s1, String s2){
        int n1 = s1.length();
        int[] freqs1 = new int[26];
        for(char c : s1.toCharArray()){
            freqs1[c-'a']++;
        }
        for(int i=idx;i<idx+n1;i++){
            char curr = s2.charAt(i);
            if(freqs1[curr-'a']<=0)return false;
            freqs1[curr-'a']--;
        }
        return true;
    }
}
