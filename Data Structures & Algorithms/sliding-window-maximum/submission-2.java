
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int i=0;
        while(i<k){
            pq.offer(nums[i]);
            i++;
        }
        int n = nums.length-k+1;
        int[] ans = new int[n];
        int idx=0;
        ans[idx]=pq.peek();
        idx++;
        
        while(i<nums.length){
            pq.remove(nums[i-k]);
            pq.offer(nums[i]);
            ans[idx] = pq.peek();
            i++;
            idx++;
        }
        return ans;
    }
}
