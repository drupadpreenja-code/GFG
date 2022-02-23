public class LCMofTwoNumbers {

    /**
     * Get the LCM of two Numbers
     * Naive solution
     * TC : O (a*b - max(a,b))
     * @param a
     * @param b
     * @return Integer
     */
    public static Integer getLeastCommonMultiple(Integer a, Integer b){
        Integer result = Math.max(a, b);
        while(true){
            if(result % a == 0 && result % b == 0){
                return result;
            }
            result++;
        }
    }
    
    
    /**
     * Get the LCM of two Numbers
     * Best solution
     * TC: O(log(min(a,b)))
     * @param a
     * @param b
     * @return Integer
     */
    public static Integer getLeastCommonMultiple2(Integer a, Integer b){
        return (a * b ) / getHcf(a, b);
    }

    private static Integer getHcf(Integer a, Integer b){
        if(b == 0){
            return a;
        } else {
            return getHcf(b, a % b);
        }
    }
}