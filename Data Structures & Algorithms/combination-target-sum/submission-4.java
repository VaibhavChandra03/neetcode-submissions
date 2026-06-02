class Solution {
    void findCombo(int[] nums, int i, int target, List<List<Integer>> ans, List<Integer> curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || i==nums.length){
            return;
        }
            //take and stay
            curr.add(nums[i]);
            findCombo(nums,i, target-nums[i],ans, curr);
            curr.remove(curr.size()-1);
            findCombo(nums,i+1,target, ans,curr);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        findCombo(nums,0,target,ans, new ArrayList<>());
        return ans;
    }
}
