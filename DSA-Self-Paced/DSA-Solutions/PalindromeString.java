public class PalindromeString {

    /**
     * Check if the String is Palindrome or not
     * @param value
     * @param start
     * @param end
     * @return Boolean
     */
    public static Boolean isPalindrome(String value, Integer start, Integer end) {
        if (start >= end) {
            return true;
        }
        return value.charAt(start) == value.charAt(end) && isPalindrome(value, start + 1, end - 1);
    }
}
