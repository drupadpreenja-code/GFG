public class PrintToN {
    
    /**
     * Print numbers from N to 1
     * @param number
     */
    public static void printFromNto1(Integer number){
        if(number < 1){
            return;
        }
        System.out.println(number);
        printFromNto1(number - 1);
    }

    /**
     * Print numbers from 1 to N
     * @param number
     */
    public static void printFrom1toN(Integer number){
        if(number == 0){
            return;
        }
        printFrom1toN(number - 1);
        System.out.println(number);
    }
}
