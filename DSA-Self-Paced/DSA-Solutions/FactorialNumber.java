public class FactorialNumber {
    /**
     * This method return the factorial
     * Not a best solution because of Auxilary space is O(n)
     * @param number
     * @return Integer
     */
    public static Integer getFactorial1(Integer number){
        if(number == 0){
            return 1;
        }
        return number * getFactorial1(number - 1);
    }

    /**
     * This method return the factorial
     * Best solution
     * @param number
     * @return Integer
     */
    public static Integer getFactorial2(Integer number){
        Integer result = 1;
        for(Integer i = 2; i <= number ; i++){
            result = result * i;
        }
        return result;
    }
}
