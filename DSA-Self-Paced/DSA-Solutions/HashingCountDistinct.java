import java.util.HashMap;

public class HashingCountDistinct {

    /**
     * Function to return the count of non-repeated elements in the array.
     * 
     * @param arr
     * @param n
     * @return
     */
    public static long countNonRepeated(int arr[], int n) {
        long result = 0;
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i : arr){
            res.put(i, res.getOrDefault(i, 0) + 1);
        }
        for(int i : res.keySet()){
            if(res.get(i) == 1){
                result++;
            }
        }
        return result;
    }
}
