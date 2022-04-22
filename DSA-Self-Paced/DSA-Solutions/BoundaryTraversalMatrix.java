import java.util.ArrayList;

public class BoundaryTraversalMatrix {

    /**
     * Function to return list of integers that form the boundary
     * traversal of the matrix in a clockwise manner.
     * 
     * @param matrix
     * @param n
     * @param m
     * @return
     */
    public static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                res.add(matrix[0][i]);
            }
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                res.add(matrix[i][0]);
            }
        } else {
            for (int i = 0; i < m; i++) {
                res.add(matrix[0][i]);
            }
            for (int i = 1; i < n; i++) {
                res.add(matrix[i][m - 1]);
            }
            for (int i = m - 2; i >= 0; i--) {
                res.add(matrix[n - 1][i]);
            }
            for (int i = n - 2; i > 0; i--) {
                res.add(matrix[i][0]);
            }
        }
        return res;
    }
}
