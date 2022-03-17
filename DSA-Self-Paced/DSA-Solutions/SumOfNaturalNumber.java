public class SumOfNaturalNumber {

    /**
     * Get the sum of natural numbers
     * @param number
     * @return Integer
     */
    public static Integer getSum(Integer number) {
        if(number == 0){
            return 0;
        }
        return number + getSum(number -1);
    }

    /**
     * Get the sum of natural numbers - Tail recursion
     * @param number
     * @return Integer
     */
    public static Integer getSum2(Integer number, Integer result){
        if(number == 0){
            return result;
        }
        return getSum2(number - 1, number + result);
    }
}
