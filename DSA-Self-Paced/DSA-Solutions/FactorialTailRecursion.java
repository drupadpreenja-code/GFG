public class FactorialTailRecursion {
    
    /**
     * This is factorial of a number using tail recursion.
     * It will take less time by modern compilers and also take less auxilary space
     * @param number
     * @param result
     * @return Integer
     */
    public static Integer getFactorial(Integer number, Integer result){
        if(number == 0 || number == 1){
            return result;
        }
        return getFactorial(number - 1, number * result);
    }
}
