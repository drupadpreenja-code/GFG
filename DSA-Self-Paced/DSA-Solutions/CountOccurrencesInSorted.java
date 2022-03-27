public class CountOccurrencesInSorted {
    
    /**
     * Count Occurrences of the elment in Sorted Array
     * @param arr
     * @param num
     * @return
     */
    public static int getCount(int arr[], int num){
        int firstIndex = getFirstIndex(arr, num);
        if(firstIndex >= 0){
            return getLastIndex(arr, num) - firstIndex + 1;
        }
        return -1;
    }

    private static int getFirstIndex(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high )/ 2;
            if(arr[mid] > num){
                high = mid - 1;
            }else if(arr[mid] < num){
                low = mid + 1;
            }else{
                if(mid == 0 || arr[mid - 1] != num){
                    return mid;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int getLastIndex(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = ( low + high ) / 2;
            if(arr[mid] > num){
                high = mid - 1;
            }else if(arr[mid] < num){
                low = mid + 1;
            }else{
                if(mid == arr.length - 1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
