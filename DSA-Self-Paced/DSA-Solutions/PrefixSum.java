public class PrefixSum {
    
    /**
     * TC: O (1), we pre processed the perfix sum
     * @param arr
     * @param l
     * @param r
     * @return
     */
    public static int getSum(int[] arr, int l, int r){
        arr = getPrefixSumArray(arr);
        if(l != 0){
            return arr[r] - arr[l-1];
        }
        return arr[r];
    }

    private static int[] getPrefixSumArray(int[] arr){
        for(int i = 1 ; i < arr.length ; i ++){
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
