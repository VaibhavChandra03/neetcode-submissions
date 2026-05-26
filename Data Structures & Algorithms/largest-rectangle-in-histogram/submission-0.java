class Solution {
    public int largestRectangleArea(int[] heights) {
        int i = 0;
        int n = heights.length;
        int maxarea = 0;
        while(i<n){
            int currh = heights[i];
            int j=i-1;
            //check left
            int len=1;
            while(j>=0){
                if(heights[j]>=currh){
                    len++;
                    j--;
                }
                else break;
            }

            //check right
            j=i+1;
            while(j<n){
                if(heights[j]>=currh){
                    len++;
                    j++;
                }
                else break;
            }
            maxarea = Math.max(maxarea,len*currh);
            i++;
        }
        return maxarea;
    }
}
