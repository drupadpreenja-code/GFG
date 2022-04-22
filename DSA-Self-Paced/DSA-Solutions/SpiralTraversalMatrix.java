import java.util.ArrayList;

public class SpiralTraversalMatrix {

    /**
     * Print the Matrix traversing in spiral shape
     * 
     * @param matrix
     * @param n
     * @param m
     * @return
     */
    public static ArrayList<Integer> spiralTraversal(int matrix[][], int r, int c) {
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
