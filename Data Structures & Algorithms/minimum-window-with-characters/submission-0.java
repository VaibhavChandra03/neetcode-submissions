class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : t.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int k = t.length();
        int i=0,j=0;
        int start = i, len=Integer.MAX_VALUE;

        while(j<s.length()){
            char c = s.charAt(j);
            mp.put(c,mp.getOrDefault(c,0)-1);
            if(mp.get(c)>=0)k--;
            
            while(k==0){
                if(len>j-i+1){
                    len = j-i+1;
                    start = i;
                }

                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                if(mp.get(s.charAt(i))>0){
                    k++;
                }
                i++;
            }

            j++;
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}
