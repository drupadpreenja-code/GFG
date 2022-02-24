public class IterativePower {

    /**
     * Find the mth power of n
     * TC : O (log(n))
     * AS : O (1) 
     * @param n
     * @param m
     * @return
     */
    public static Integer getIterativePower(Integer n, Integer m){
        Integer result = 1;
        while(m > 0){
            if(m % 2 != 0){
                result = result * n;
            }
            m = m / 2;
            n = n * n;
        }
        return result;
    }
}
