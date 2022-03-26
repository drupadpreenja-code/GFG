import java.util.*;

public class ReverseInGroups {

    /**
     * Reverse an Array in Groups
     * @param arr
     * @param n
     * @param k
     */
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(Integer i = 0; i < n ; i += k){
            Integer left = i ;
            Integer right = Math.min(i + k - 1, n - 1);
            while(left < right){
                Integer temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left ++;
                right --;
            }
        }
    }
}
