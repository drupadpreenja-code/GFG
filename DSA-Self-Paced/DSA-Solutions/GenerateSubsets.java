public class GenerateSubsets {
    
    /**
     * Get all the Subsets of the string passed
     * @param value
     */
    public static void getSubsets(String value){
        printSubsets(value, "", 0);
    }

    /**
     * This method is called recursively twice with current string and current string + next character
     * @param value
     * @param currentString 
     * @param number Index
     */
    private static void printSubsets(String value, String currentString, Integer number){

        if(number == value.length()){
            System.out.println(currentString);
            return;
        }
        printSubsets(value, currentString, number + 1);
        printSubsets(value, currentString + value.substring(number, number + 1), number + 1);
    }
}
