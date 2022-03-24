public class MaximumIndexDifference {
    
    /**
     * Find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
     * @param arr
     * @return
     */
    public static int maxIndexDiff(int[] arr){
        int res = -1 ;
        int left = arr[0], right = arr[arr.length-1];
        int[] leftmin = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftmin[0] = left;
        rightMax[arr.length-1] = right;
        for(int i = 1; i < arr.length; i++){
            left = Math.min(arr[i], left);
            leftmin[i] = left;

            right = Math.max(arr[arr.length - 1 - i], right);
            rightMax[arr.length - 1 - i] = right;
        }
        int i = 0;
        int j = 0;
        while(i < arr.length && j < arr.length){
            if(leftmin[i] <= rightMax[j]){
                res = Math.max(res, j - i);
                j++;
            }else{
                i++;
            }
        }
        return res;
    }
}
