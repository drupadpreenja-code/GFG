public class SmallestPositiveMissingNumber {
    
    /**
     * Smallest Positive missing number
     * arr[] = {1,2,3,4,5}
     * Output: 6
     * Explanation: Smallest positive missing 
     * number is 6.
     * @param arr
     * @return
     */
    public static int getMissingNumber(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            // Check only positive, Less than length, value != index + 1
            // Swap the values till a[i] == i + 1
            while (arr[i] > 0 && arr[i] < arr.length && arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] != i + 1){
                return i+1;
            }
        }
        return arr.length + 1;
    }
}
