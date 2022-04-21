import java.util.ArrayList;

public class SumOfUpperLowerTriangles {

    /**
     * Given a square matrix of size N*N, print the sum of upper and lower
     * triangular elements.
     * 
     * @param matrix
     * @param n
     * @return
     */
    public static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        Integer upper = 0;
        Integer lower = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                upper += matrix[i][j];
                lower += matrix[j][i];
            }
        }
        res.add(upper);
        res.add(lower);
        return res;
    }
}
