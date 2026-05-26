class Solution {
    public int maxArea(int[] heights) {
        int s = 0;
        int e = heights.length-1;
        int maxarea = 0;
        while(s<e){
            int area = (e-s)*Math.min(heights[e],heights[s]);
            maxarea = Math.max(area,maxarea);
            if(heights[s]<heights[e]){
                s++;
            }else{
                e--;
            }
        }
        return maxarea;
    }
}
