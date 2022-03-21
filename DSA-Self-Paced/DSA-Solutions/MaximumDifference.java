public class MaximumDifference {
    
    /**
     * Get Maximum value of arr[j] - arr[i] such that j > i
     * @param arr
     * @return
     */
    public static int getMaxDifference(int[] arr){
        int result = arr[1] - arr[0];
        int minimumValue = arr[0];
        for(int i = 1; i < arr.length ; i ++){
            result = Math.max(result, arr[i] - minimumValue);
            minimumValue = Math.min(minimumValue, arr[i]);
        }
        return result;
    }
}
