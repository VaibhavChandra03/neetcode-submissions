class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i : nums){
            currsum = Math.max(currsum+i, i);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
}
