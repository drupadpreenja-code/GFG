public class SearchSortedMatrix {

    /**
     * Function to search a given number in row-column sorted matrix.
     * 
     * @param matrix
     * @param n
     * @param m
     * @param x
     * @return
     */
    static boolean search(int matrix[][], int n, int m, int x) {
        int top = 0, right = m - 1;
        while (top <= (n - 1) && (right >= 0)) {
            if (matrix[top][right] > x) {
                right--;
            } else if (matrix[top][right] < x) {
                top++;
            } else {
                return true;
            }
        }
        return false;
    }

}