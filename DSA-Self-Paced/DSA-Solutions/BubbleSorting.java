public class BubbleSorting {
    
    /**
     * Bubble sort
     * It never changes order of equal elements
     * So, It is stable and is also in place as it 
     * doesn't require any extra array
     * TC: O(n^2)
     * @param arr
     * @return
     */
    public static int[] getSortedArray(int[] arr){
        Boolean isSwapped;
        for(int i = 0; i < arr.length - 1; i ++){
            isSwapped = false;
            for(int j = 0; j < arr.length - 1 - i; j ++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped){
                break;
            }
        }
        return arr;
    }
}
