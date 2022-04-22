public class RotateMatrix90 {

    /**
     * Function to rotate matrix anticlockwise by 90 degrees.
     * 
     * @param matrix
     * @param n
     */
    public static void rotateby90(int matrix[][], int n) {
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n / 2 ; i++ ){
            for(int j = 0 ; j < n ; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }
}
