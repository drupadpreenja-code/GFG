import java.util.ArrayList;

public class HashingSeperateChaining {

    /**
     * Function to insert elements of array in the hashTable avoiding collisions.
     * 
     * @param arr
     * @param n
     * @param hashSize
     * @return
     */
    public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(hashSize);
        for (int i = 0; i < hashSize; i++) {
            res.add(new ArrayList<>());
        }
        for (Integer i : arr) {
            res.get(i % hashSize).add(i);
        }
        return res;
    }
}
