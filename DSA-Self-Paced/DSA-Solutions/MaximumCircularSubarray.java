public class MaximumCircularSubarray {
    
    /**
     * Find the Maximum Circular Sub array
     * Max ( normalMaxSubarray , circularMaxSubarray)
     * circularMaxSubarray = Total sum of array - (Min sum of subarray)
     * !Imp : Min sum of subarray = -(normal Maximum sum of inverse subarray)
     * @param arr
     * @return
     */
    public static int getMaximumCircularSubarray(int[] arr){
        int normalRes = getMaximumNormalSubarray(arr);
        //!Important step
        if(normalRes < 0 ){
            return normalRes;
        }
        int arr_sum = 0; 
        for(int i = 0 ; i < arr.length ; i ++){
            arr_sum += arr[i];
            arr[i] = - arr[i];
        }
        return Math.max(normalRes, arr_sum - ( - getMaximumNormalSubarray(arr)));
    }

    private static int getMaximumNormalSubarray(int[] arr){
        int res = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length ; i++){
            max = Math.max(arr[i], arr[i] + max);
            res = Math.max(max, res);
        }
        return res;
    }
}
