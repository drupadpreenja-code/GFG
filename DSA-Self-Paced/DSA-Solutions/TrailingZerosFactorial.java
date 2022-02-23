public class TrailingZerosFactorial {

    /**
     * This is to get the number of trailing zeros in a factorial of number
     * @return Integer
     */
    public static Integer getTrailingZeros(Integer number){
        Integer result = 0;
        for(Integer i = 5; i < number ; i *= 5){
            result += number / i;
        }
        return result;
    }
}
