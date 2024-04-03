
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int len = n1+n2;
        int[] mergedArray = new int[len];
        System.arraycopy(nums1,0,mergedArray,0,n1);
        System.arraycopy(nums2,0,mergedArray,n1,n2);
        for(int i = 0;i<len;i++){
            System.out.print(mergedArray[i]+" ");
        }
        System.out.println();
        Arrays.sort(mergedArray);
        if(len%2 !=0){
            int medianIndex =((len)/2);
            double median = mergedArray[medianIndex];
            return median;
        }

        else {
            int mIndex1 = ((len-1)/2);
            int mIndex2 = mIndex1+1;
            double median = (mergedArray[mIndex1]+mergedArray[mIndex2])/2.0;
            return median;
        }
    }
}