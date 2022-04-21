public class TransposeMatrix {

    /**
     * Find the transpose of a square matrix of size N*N
     * 
     * @param matrix
     * @param n
     */
    public static void transpose(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
