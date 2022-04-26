import java.util.HashMap;

public class HashingLongestSubarraySum {

    /**
     * Function to find the length of Longest subarray with given sum
     * 
     * @param arr
     * @param sum
     * @return
     */
    public static int getLength(int[] arr, int sum) {
        int res = 0, preSum = 0;
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if(preSum == sum){
                res = i + 1;
            }
            if (!sums.containsKey(preSum)) {
                sums.put(preSum, i);
            }
            if (sums.containsKey(preSum - sum)) {
                res = Math.max(i - sums.get(preSum - sum), res);
            }
        }
        return res;
    }

}