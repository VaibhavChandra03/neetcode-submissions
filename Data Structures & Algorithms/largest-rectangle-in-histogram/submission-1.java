class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && curr < heights[st.peek()]) {
                int h = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;
                max = Math.max(max, h * width);
            }
            st.push(i);
        }
        return max;
    }
}
