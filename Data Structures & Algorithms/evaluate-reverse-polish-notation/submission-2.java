class Solution {
    public int evalRPN(String[] tokens) {
        int ans  = 0;
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                if(s.equals("+")){
                    st.add(a+b);
                }else if(s.equals("-")){
                    st.add(a-b);
                }else if(s.equals("*")){
                    st.add(a*b);
                }else{
                    st.add(a/b);
                }
            }else{
                st.add(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}
