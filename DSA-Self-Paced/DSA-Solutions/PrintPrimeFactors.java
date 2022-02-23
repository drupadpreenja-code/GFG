public class PrintPrimeFactors {
    
    /**
     * This will print all the prime factors for the number
     * TC : O(sqrt(n))
     * @param number
     */
    public static void displayPrimeFactors(Integer number){
        if(number <= 1){
            return;
        }
        while(number % 2 == 0){
            System.out.print(2);
            number = number / 2;
        }
        while(number % 3 == 0){
            System.out.print(3);
            number = number / 3;
        }
        for(Integer i = 5; i * i <= number ; i += 6 ){
            while(number % i == 0){
                System.out.print(i);
                number = number / i;
            }
            while(number % (i + 2) == 0){
                System.out.print(i + 2);
                number = number / (i + 2);
            }
        }
        if(number > 3){
            System.out.print(number);
        }
    }
}
