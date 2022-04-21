import java.util.ArrayList;

public class MatricesSnakePattern {

    /**
     * Print the elements of the matrix in the snake like pattern
     * 
     * @param matrix
     * @return
     */
    public static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    res.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}
