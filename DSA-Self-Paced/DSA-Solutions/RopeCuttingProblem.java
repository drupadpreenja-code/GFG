public class RopeCuttingProblem {
    
    /**
     * Find the Maximum Number of pieces
     * Length of every piece, after cuts, should be in set {a,b,c}
     * TC: O(3^n)
     * @param number Length of the Rope
     * @param a 
     * @param b
     * @param c
     * @return
     */
    public static Integer maxPieces(Integer number, Integer a, Integer b, Integer c){

        if(number == 0){
            return 0;
        }
        if(number < 0 ){
            return -1;
        }
        
        Integer result = Math.max(
            maxPieces(number - a , a, b, c), 
            Math.max(
                maxPieces(number - b , a, b, c), 
                maxPieces(number - c , a, b, c)
            )
        );

        if(result == -1){
            return -1;
        }

        return result + 1;
    } 
}
