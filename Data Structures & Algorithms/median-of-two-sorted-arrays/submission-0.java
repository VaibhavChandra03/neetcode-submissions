class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        int n1 = nums1.length, n2 = nums2.length;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<n1){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n2){
            arr.add(nums2[j]);
            j++;
        }
        int n = arr.size();
        if(n%2==0){
            int a = arr.get(n/2);
            int b = arr.get(n/2-1);
            return (double)(a+b)/2;
        }else{
            return (double)arr.get(n/2);
        }
        // return 0;
    }
}
