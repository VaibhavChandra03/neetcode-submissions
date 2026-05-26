class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0,e=nums.length-1;
        boolean found = false;
        while(!found && s<=e){
            if(nums[s]+nums[e]==target){
                return new int[]{s+1,e+1};
            }else if(nums[s]+nums[e]>target){
                e--;
            }else{
                s++;
            }
        }
        return new int[]{-1,-1};
    }
}
