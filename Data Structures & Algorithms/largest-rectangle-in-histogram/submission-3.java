class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxar=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int curr = (i==n)?0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h = heights[st.pop()];
                int right = i;
                int left = (st.isEmpty())?-1:st.peek();

                int curar = h*(right-left-1);
                maxar = Math.max(maxar,curar);
            }
            st.add(i);
        }
        return maxar;
    }
}
