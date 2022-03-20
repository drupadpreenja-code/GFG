public class ReverseAnArray {
    
    /**
     * Reverse an Integer array
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        if(first < last){
            while(first < last){
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
        }
        return arr;
    }
}
