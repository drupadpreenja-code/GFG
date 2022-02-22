/** 
 * Count the number of digits in the number
*/
public class CountDigits {
    public static Integer getNumberOfDigits(Integer number){
        Integer result = 0;
        while(number > 0){
            result++;
            number = number / 10;
        }
        return result;
    }
}
