public class MaximumSumSubarray {
    
    /**
     * Maximum Sum of the Subarray in the given array
     * @param arr
     * @return
     */
    public static int maxSum(int[] arr){
        int res = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(arr[i], arr[i] + max);
            res = Math.max(res, max);
        }
        return res;
    }
}
