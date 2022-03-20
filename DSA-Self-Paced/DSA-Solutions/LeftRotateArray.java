public class LeftRotateArray {

    /**
     * Left rotate the array by digits
     * @param arr
     * @param digits
     * @return
     */
    public static int[] leftRotate(int[] arr, int digits) {
        int arrLen = arr.length;

        // reverse (0 , d - 1)
        int high = digits - 1;
        int low = 0;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // reverse (d , n - 1)
        high = arrLen - 1;
        low = digits;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // reverse (0 , n - 1)
        high = arrLen - 1;
        low = 0;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

}
