import java.util.HashMap;

public class HashingSubarrayGivenSum {

    /**
     * Function to count the number of subarrays which adds to the given sum.
     * 
     * @param arr
     * @param n
     * @param sum
     * @return
     */
    public static int subArraySum(int arr[], int n, int sum) {
        // add your code here
        int count = 0;
        HashMap<Integer, Integer> sumsVsCount = new HashMap<>();
        int preSum = 0;
        for (int i : arr) {
            preSum += i;
            if (sumsVsCount.containsKey(preSum - sum)) {
                count += sumsVsCount.get(preSum - sum);
            }
            if (preSum == sum) {
                count++;
            }
            sumsVsCount.put(preSum, sumsVsCount.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
