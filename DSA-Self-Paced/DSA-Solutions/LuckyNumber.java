public class LuckyNumber {
    
    /**
     * Take the set of integers
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
     * First, delete every second number, we get following reduced set.
     * 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
     * Now, delete every third number, we get
     * 1, 3, 7, 9, 13, 15, 19,….….
     * Continue this process indefinitely……
     * Any number that does NOT get deleted due to above process is called “lucky”
     * @param number
     * @return
     */
    public static Boolean isLucky(Integer number){
        return checkLuck(number, 2);
    }

    private static Boolean checkLuck(Integer number, Integer counter){
        if(number % counter == 0){
            return false;
        }
        if(number < counter){
            return true;
        }
        return checkLuck(number - (number/counter), counter + 1);
    }
}
