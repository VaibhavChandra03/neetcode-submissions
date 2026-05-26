class Solution {
    void groupana(String s, Map<String,List<String>> mp){
        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        String nkey = new String(carr);
        if(!mp.containsKey(nkey)){
            mp.put(nkey,new ArrayList<>());
        }
        mp.get(nkey).add(s);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        int n = strs.length;
        for(int i=0;i<n;i++){
            groupana(strs[i],mp);
        }
        return new ArrayList<>(mp.values());
    }
}
