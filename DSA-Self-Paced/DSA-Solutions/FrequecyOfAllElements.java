public class FrequecyOfAllElements {
    
    /**
     * Print Frequency of all the elements in a sorted array
     * @param arr
     */
    public static void printFrequency(int[] arr){
        int count = 1;
        int i = 0;
        while(i < arr.length - 1){
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i] + " - " + String.valueOf(count));
                count = 1;
            }else{
                count++;
            }
            i++;
        }
        if(arr[arr.length - 1 ] == arr[arr.length - 2]){
            System.out.println(arr[i] + " - " + String.valueOf(count));
        }else{
            System.out.println(arr[i] + " - 1");
        }
    }
}
