import java.util.ArrayList;
import java.util.HashSet;

public class HashingPositiveNegativePair {

    /**
     * Function to return list containing all the pairs having both
     * negative and positive values of a number in the array.
     * 
     * @param arr
     * @param n
     * @return
     */
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> valid = new HashSet<Integer>();
        for (int i : arr) {
            if (valid.contains(i) || valid.contains(i * -1)) {
                res.add(i < 0 ? i : i * -1);
                res.add(i > 0 ? i : i * -1);
            }
            valid.add(i);
        }
        return res;
    }
}