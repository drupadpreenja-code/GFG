public class BinaryEquivalentOfNumber {

    /**
     * Print the Binary Equivalent of the Number
     * @param number
     */
    public static void printBinaryEquivalent(Integer number){
        if(number == 0){
            return;
        }
        printBinaryEquivalent(number / 2);
        System.out.print(number % 2);
    }
}
