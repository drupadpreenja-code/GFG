public class AllDivisorsAscending {
    
    /**
     * This will print all the divisors of the number in ascending order
     * @param number
     */
    public static void displayAllDivisors(Integer number){
        Integer i;
        for(i = 1 ; i * i < number ; i ++ ){ // Imp
            if(number % i == 0){
                System.out.println(i);
            }
        }
        for( ; i >= 1 ; i -- ){
            if(number % i == 0){
                System.out.println(number / i); // Imp
            }
        }
    }
}
