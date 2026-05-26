class Solution {
    int helper(int i, int prev, int[] nums){
        if(i==nums.length)return 0;

        //take
        int take = 0;
        if(prev==Integer.MIN_VALUE || prev+1==nums[i]){
            take = 1+helper(i+1,nums[i],nums);
        }
        //nottake
        int nottake = helper(i+1,prev,nums);
        return Math.max(take,nottake);
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        return helper(0,Integer.MIN_VALUE,nums);
    }
}
