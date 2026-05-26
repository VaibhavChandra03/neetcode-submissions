class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] des = new double[n][2];
        for(int i=0;i<n;i++){
            des[i][0] = position[i];
            des[i][1] = (double)(target-position[i])/speed[i];
        }
        Arrays.sort(des,(a,b)->Double.compare(b[0],a[0]));
        Stack<Double> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()<des[i][1]){
                st.add(des[i][1]);
            }
        }
        return st.size();
    }
}
