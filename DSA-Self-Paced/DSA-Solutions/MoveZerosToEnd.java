public class MoveZerosToEnd {
    
    /**
     * Move all the Zeros in the array to the end.
     * @param arr
     * @return
     */
    public static int[] moveZeros(int[] arr) {
        int indexForZero = 0;
        for(int i = 0; i < arr.length ; i ++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[indexForZero];
                arr[indexForZero] = temp;
                indexForZero++;
            }
        }
        return arr;
    }
}
