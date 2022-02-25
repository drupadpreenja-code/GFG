public class DigitsInFactorial {

    /**
     * Get the number of digits in factorial of the number
     * @param N
     * @return int
     */
    public static int digitsInFactorial(int N){
        double result = 0;
        for(Integer i = 1 ; i <= N ; i ++){
            result += Math.log10(i);
        }
        return (int) result + 1;
    }
}
