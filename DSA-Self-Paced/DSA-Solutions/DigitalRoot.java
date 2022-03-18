public class DigitalRoot {
    
    /**
     * DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
     * @return
     */
    public static Integer getDigitalRoot(Integer number){
        if(number < 10){
            return number;
        }
        return getDigitalRoot(getDigitalRoot(number / 10) + number % 10);
    }
}
