public class IndexOfFirstOccurrence {
    
    /**
     * Search the Index of First Occurrence of element in sorted array
     * @param arr
     * @param num
     * @return
     */
    public static int getIndex(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high )/ 2;
            if(arr[mid] > num){
                high = mid - 1;
            }else if(arr[mid] < num){
                low = mid + 1;
            }else{
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
