public class SumOfDigits {
    
    /**
     * Get the Sum of digits in a number
     * TC: O(d)
     * AS: O(d)
     * @param number
     * @return
     */
    public static Integer getSum(Integer number){
        if(number == 0){
            return 0;
        }
        return getSum(number / 10) + number % 10;
    }

    /**
     * Get the Sum of digits in a number - Tail Recursion
     * @param number
     * @param result
     * @return
     */
    public static Integer getSum2(Integer number, Integer result){
        if(number == 0){
            return result;
        }
        return getSum2(number / 10, result + number % 10);
    }
}
