import java.util.Arrays;

public class SieveOfEratosthenes {
    
    /**
     * This will print all the prime numbers smaller than n
     * @param number
     */
    public static void displayPrimeNumbers(Integer number){
        Boolean[] arr = new Boolean[number + 1];
        Arrays.fill(arr, true);
        for(Integer i = 2; i <= number ; i++){
            if(arr[i]){
                System.out.println(i);
                for(Integer j = i*i; j <= number; j = j + i){
                    arr[j] = false;
                }
            }
        }
    }
}
