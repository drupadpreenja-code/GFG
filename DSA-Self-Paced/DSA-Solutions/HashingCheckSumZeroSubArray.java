import java.util.HashSet;

public class HashingCheckSumZeroSubArray {

    /**
     * Function to check whether there is a subarray present with 0-sum or not.
     * 
     * @param arr
     * @param n
     * @return
     */
    public static boolean findsum(int arr[], int n) {
        HashSet<Integer> sums = new HashSet<Integer>();
        int preSum = 0;
        for (int i : arr) {
            preSum += i;
            if (sums.contains(preSum) || preSum == 0) {
                return true;
            }
            sums.add(preSum);
        }
        return false;
    }
}
