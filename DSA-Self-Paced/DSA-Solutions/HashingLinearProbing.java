import java.util.Arrays;

public class HashingLinearProbing {

    /**
     * Function to fill the array elements into a hash table
     * using Linear Probing to handle collisions.
     * 
     * @param hash_size
     * @param arr
     * @param sizeOfArray
     * @return
     */
    public static int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int[] res = new int[hash_size];
        Arrays.fill(res, -1);
        for (int i : arr) {
            int hashIndex = (i % hash_size);
            while (res[hashIndex] != -1) {
                hashIndex = (hashIndex + 1) % hash_size;
            }
            res[hashIndex] = i;
        }
        return res;
    }
}
