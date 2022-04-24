import java.util.HashMap;

public class HashingCheckSumZero {

    /**
     * Function to check if two arrays are equal or not.
     * 
     * @param A
     * @param B
     * @param N
     * @return
     */
    public static boolean check(long A[], long B[], int N) {
        HashMap<Long, Integer> res = new HashMap<Long, Integer>();
        for (long i : A) {
            res.put(i, res.getOrDefault(i, 0) + 1);
        }
        for (long i : B) {
            if (!(res.containsKey(i) && res.get(i) > 0)) {
                return false;
            } else {
                res.put(i, res.get(i) - 1);
            }
        }
        return true;
    }
}