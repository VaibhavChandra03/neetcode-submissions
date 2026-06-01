class Solution {
    void createSubset(int i, List<List<Integer>> ans, List<Integer> curr, int[] nums, int n){
        if(i==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //take
        curr.add(nums[i]);
        createSubset(i+1,ans,curr,nums,n);
        curr.remove(curr.size()-1);
        createSubset(i+1,ans,curr,nums,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        createSubset(0,ans,new ArrayList<>(),nums,n);
        return ans;
    }
}
