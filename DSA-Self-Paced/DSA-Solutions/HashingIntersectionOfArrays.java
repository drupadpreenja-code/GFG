import java.util.HashSet;

public class HashingIntersectionOfArrays {

    /**
     * Function to return the count of the number of elements in
     * the intersection of two arrays.
     * 
     * @param a
     * @param b
     * @param n
     * @param m
     * @return
     */
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int res = 0;
        HashSet<Integer> temp = new HashSet<Integer>();
        for(int i : a){
            temp.add(i);
        }
        for(int i : b){
            if(temp.contains(i)){
                res++;
                temp.remove(i);// Important Step
            }
        }
        return res;
    }
}
