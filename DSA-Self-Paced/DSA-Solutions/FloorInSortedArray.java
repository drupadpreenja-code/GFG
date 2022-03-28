public class FloorInSortedArray {
    
    /**
     * Find Index of FLoor in a Sorted Array
     * Floor of num is defined as the largest element K in arr[] such 
     * that K is smaller than or equal to num. Find the index of K(0-based indexing).
     * @param arr
     * @param num
     * @return
     */
    public static int getIndex(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > num){
                high = mid - 1;
            }else if(arr[mid] < num){
                low = mid + 1;
                res = mid;
            }else{
                return mid;
            }
        }
        return res;
    }
}
