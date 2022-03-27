public class SearchInfiniteSorted {

    /**
     * Find the index of Element in Infinite Sorted Array
     * @param arr
     * @param num
     * @return
     */
    public static int getIndex(int arr[], int num) {
        if (arr[0] == num) {
            return 0;
        }
        int i = 1;
        while (arr[i] < num) {
            i = i * 2;
        }
        if (arr[i] == num) {
            return i;
        }
        return binarySearch(arr, num, (i / 2 ) + 1, i);
    }

    private static int binarySearch(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > num){
                high = mid - 1;
            }else if(arr[mid] < num){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
