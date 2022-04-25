import java.util.HashMap;

public class HashingZeroSumSubArray {

    /**
     * Function to count subarrays with sum equal to 0.
     * 
     * @param arr
     * @param n
     * @return
     */
    public static long findSubarray(long[] arr, int n) {
        long count = 0;
        long preSum = 0;
        HashMap<Long, Long> sums = new HashMap<Long, Long>();
        sums.put((long)0,(long)1);
        for (long i : arr) {
            preSum += i;
            if (sums.containsKey(preSum)) {
                count += sums.get(preSum);
            }
            sums.put(preSum, sums.getOrDefault(preSum, Long.valueOf(0)) + 1);
        }
        return count;
    }
}
