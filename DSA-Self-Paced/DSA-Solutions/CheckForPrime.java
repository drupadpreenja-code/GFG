public class CheckForPrime {

    /**
     * Check if the Number is prime or not
     * TC : O (sqrt(n))
     * @param number
     * @return Boolean
     */
    public static Boolean checkPrime(Integer number){
        if(number == 1 || number % 2 == 0 || number % 3 == 0){
            return false;
        }
        for(Integer i = 5; i*i <= number; i += 6){
            if(number % i == 0 || number % ( i + 2 ) == 0){
                return false;
            }
        }
        return true;
    }
}
