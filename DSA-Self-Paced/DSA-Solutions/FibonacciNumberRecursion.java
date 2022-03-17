public class FibonacciNumberRecursion {
    
    /**
     * Get the Fibonacci Number at nth position
     * @param number
     * @return Integer
     */
    public static Integer getFibonacci(Integer number){
        // if(number == 0){
        //     return 0;
        // }
        // if(number == 1){
        //     return 1;
        // }
        if(number <= 1){
            return number;
        }
        return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
}
