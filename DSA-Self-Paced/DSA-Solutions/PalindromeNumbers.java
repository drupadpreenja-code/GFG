public class PalindromeNumbers {
    /**
     * Check if the number if it is palindrome or not
     * TC : O(d) where d is the number of digits
     * @param number
     * @return Boolean
     */
    public static Boolean isPalindrome(Integer number){
        Integer reverse = 0;
        Integer temp = number;
        while (temp != 0){
            reverse = reverse * 10 + (temp % 10);
            temp = temp / 10;
        }
        return reverse.equals(number);
    }
}
