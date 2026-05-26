
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int i=0;
        while(i<k){
            pq.offer(nums[i]);
            i++;
        }
        List<Integer>ans = new ArrayList<>();
        ans.add(pq.peek());
        
        while(i<nums.length){
            pq.remove(nums[i-k]);
            pq.offer(nums[i]);
            ans.add(pq.peek());
            i++;
        }
        int n = ans.size();
        int[] finans = new int[n];
        for(int j=0;j<n;j++){
            finans[j]=ans.get(j);
        }
        return finans;
    }
}
