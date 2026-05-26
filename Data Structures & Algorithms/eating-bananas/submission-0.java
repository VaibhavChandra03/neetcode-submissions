class Solution {
    int gettime(int rate, int[] piles){
        int t = 0;
        for(int i : piles){
            t += (i + rate - 1) / rate;
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxban = piles[0];
        for(int i : piles){
            maxban = Math.max(maxban, i);
        }
        int s=1,e=maxban;
        int minans = Integer.MAX_VALUE;
        while(s<=e){
            int mid = s+(e-s)/2;
            int time = gettime(mid,piles);
            if(time<=h){
                minans = Math.min(minans,mid);
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return minans;
    }
}
