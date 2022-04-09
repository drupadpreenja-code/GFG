public class InsertionSorting {

    /**
     * Insertion Sort (logic : left side sorted right unsorted)
     * TC: O(n^2)
     * @param arr
     * @return
     */
    public static int[] getSortedArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            int key = arr[i];
            while (index > 0 && key < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = key;
        }
        return arr;
    }
}
