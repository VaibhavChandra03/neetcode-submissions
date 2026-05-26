class Solution {
    public int findMin(int[] nums) {
        int s = 0,e=nums.length-1;
        // int minval = nums[0];
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[e]<nums[mid]){
                s=mid+1;
            }else{
                e = mid;
            }
        }
        return nums[s];
    }
}
