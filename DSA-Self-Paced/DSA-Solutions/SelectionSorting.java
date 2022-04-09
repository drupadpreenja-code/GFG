public class SelectionSorting {
    
    /**
     * Selection Sort
     * It is unstable
     * TC: O(n^2) always even if array is sorted
     * @param arr
     * @return
     */
    public static int[] getSortedArray(int[] arr){
        for(int i = 0 ; i < arr.length - 1; i ++){
            int index = i;
            for(int j = i+1; j < arr.length; j ++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
