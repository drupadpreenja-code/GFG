public class AddTwoMatrix {

    /**
     * Given two matrices A and B having (n1 x m1) and (n2 x m2) dimensions respectively. 
     * Add A and B
     * If the addition is not possible return an empty matrix (of size zero).
     * @param A
     * @param B
     * @return
     */
    public static int[][] sumMatrix(int A[][], int B[][]) {
        if(A.length != B.length){
            return new int[0][0];
        }
        for(int i = 0; i < A.length ; i ++){
            if(A[i].length != B[i].length){
                return new int[0][0];
            }
        }
        for( int i = 0 ; i < A.length ; i++ ){
            for( int j = 0 ; j < A[0].length ; j++){
                B[i][j] = B[i][j] + A[i][j]; 
            }
        }
        return B;
    }
}
