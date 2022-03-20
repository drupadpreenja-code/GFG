public class PermutationOfString {

    /**
     * Print all the permutauion of the letters in the string passed
     * @param value
     */
    public static void printPermutationOfString(String value) {
        processPermutationOfString(value, 0);
    }

    private static void processPermutationOfString(String value, int index) {
        int totalLength = value.length();
        char[] allValues = value.toCharArray();

        if(index == value.length() - 1){
            System.out.println(value);
            return;
        }

        for(int j = index; j < totalLength ; j++){
            char temp = allValues[index];
            allValues[index] = allValues[j];
            allValues[j] = temp;
            value = String.valueOf(allValues);
            
            processPermutationOfString(value, index + 1);

            char temp2 = allValues[j];
            allValues[j] = allValues[index];
            allValues[index] = temp2;
            value = String.valueOf(allValues);
        }
    }
}