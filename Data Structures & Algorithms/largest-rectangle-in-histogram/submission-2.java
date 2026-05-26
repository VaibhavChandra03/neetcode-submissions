class Solution {
    int[] findnse(int[] arr){
        int n = arr.length;
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                ans[st.pop()] = i;
            }
            st.add(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=n;
        }
        return ans;
    }

    int[] findpse(int[] arr){
        int n = arr.length;
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                ans[st.pop()] = i;
            }
            st.add(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = findpse(heights);
        int[] nse = findnse(heights);
        int max = 0;

        for (int i = 0; i < n; i++) {
            int currar = heights[i]*(nse[i]-pse[i]-1);
            max = Math.max(max,currar);
        }
        return max;
    }
}
