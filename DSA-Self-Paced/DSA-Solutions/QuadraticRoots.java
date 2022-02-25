import java.util.ArrayList;
import java.util.Collections;

public class QuadraticRoots {

    /**
     * Return the maximum root followed by the minimum root and -1 in case of Imaginary
     * @param a
     * @param b
     * @param c
     * @return Array of Integer
     */
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> result = new ArrayList<>();
        Integer d = b * b - 4 * a * c;
        if(d < 0){
            result.add(-1);
        }else{
            result.add((int)Math.floor( (Double.valueOf(-b) + Math.sqrt(d)) / (2.0 * Double.valueOf(a)) ));
            result.add((int)Math.floor( (Double.valueOf(-b) - Math.sqrt(d)) / (2.0 * Double.valueOf(a)) ));
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
