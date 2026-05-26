class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.add(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                ans[st.peek()] = i-st.peek();
                st.pop();
            }
            st.add(i);
        }
        return ans;
    }
}
