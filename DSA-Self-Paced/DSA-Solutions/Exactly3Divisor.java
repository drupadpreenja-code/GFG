public class Exactly3Divisor {

    /**
     * Find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
     * Logic : number of square of prime less than N i.e. 4, 9, 25, 49...
     * TC : O (log( pow(n, 1/2) pow(n, 1/4)))
     * @param N
     * @return Integer
     */
    public static Integer exactly3Divisors(Integer N) {
        Integer count = 0;
        for (Integer i = 1; i * i <= N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static Boolean isPrime(Integer N) {
        if (N == 2 || N == 3) {
            return true;
        }
        if (N == 1 || N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        for (Integer i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || (N % (i + 2)) == 0) {
                return false;
            }
        }
        return true;
    }
}
