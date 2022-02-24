public class ComputingPower {

    /**
     * Find the mth power of n
     * TC: O (logn(n))
     * @param n
     * @param m
     * @return
     */
    public static Integer getPower(Integer n, Integer m) {
        if (n == 0) {
            return 1;
        }
        Integer temp = getPower(n, m / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * n;
        }
    }
}
