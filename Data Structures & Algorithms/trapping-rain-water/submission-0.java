class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0]=height[0];
        post[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            pre[i] = Math.max(pre[i-1],height[i]);
            post[n-i-1] = Math.max(post[n-i],height[n-i-1]);
        }
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            diff[i] = Math.min(pre[i],post[i]);
        }
        int res = 0;
        for(int i=0;i<n;i++){
            res+= (diff[i]-height[i]);
        }
        return res; 
    }
}
