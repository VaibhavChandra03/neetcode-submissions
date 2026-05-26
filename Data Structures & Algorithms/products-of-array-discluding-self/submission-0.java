class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ltor[] = new int[n];
        int rtol[] = new int[n];
        ltor[0]=1;
        for(int i=1;i<n;i++){
            ltor[i] = ltor[i-1]*nums[i-1];
        }
        rtol[n-1]=1;
        for(int i=n-2;i>=0;i--){
            rtol[i] = rtol[i+1]*nums[i+1];
        }
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = ltor[i]*rtol[i];
        }
        return ans;
    }
}  
