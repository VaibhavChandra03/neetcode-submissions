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
        int n = nums.length;
        if(n==0)return 0;
        Arrays.sort(nums);
        // return helper(0,Integer.MIN_VALUE,nums);
        int i = 1;
        int currcnt=1;
        int maxcnt = 1;
        while(i<n){
            if(nums[i-1]+1==nums[i]){
                currcnt++;
            }else if(nums[i-1]==nums[i]){
                i++;
                continue;
            }
            else{
                maxcnt = Math.max(currcnt, maxcnt);
                currcnt = 1;
            }
            i++;
        }
        maxcnt = Math.max(currcnt,maxcnt);
        return maxcnt;
    }
}
