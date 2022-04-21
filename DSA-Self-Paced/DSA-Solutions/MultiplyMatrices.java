public class MultiplyMatrices {

    /**
     * Program to returns a matrix containing product of two matrices
     * 
     * @param A
     * @param B
     * @return
     */
    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        if(A[0].length != B.length){
            return new int[0][0];
        }
        int[][] res = new int[A.length][B[0].length]; 
        for(int i = 0; i < A.length ; i ++){
            for(int j = 0; j < B[0].length ; j++){
                for(int k = 0 ; k < A[0].length ; k++){
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }
}