public class BeautifulMatrix {

    /**
     * Function to find minimum number of operations that are required
     * to make the matrix beautiful.
     * 
     * A beautiful matrix is a matrix in which the sum of elements in each
     * row and column is equal.
     * 
     * @param matrix
     * @param n
     * @return
     */
    public static int findMinOperation(int matrix[][], int n) {
        int res = 0, max = 0;
        int rows[] = new int[n];
        int cols[] = new int[n];
        for (int i = 0; i < n; i++) {
            rows[i] = 0;
            cols[i] = 0;
            for (int j = 0; j < n; j++) {
                rows[i] += matrix[i][j];
                cols[i] += matrix[j][i];
            }
            max = Math.max(max, Math.max(rows[i], cols[i]));
        }
        for (int i = 0; i < n; i++) {
            res += max - rows[i];
        }
        return res;
    }
}
