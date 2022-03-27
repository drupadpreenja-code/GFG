public class SquareRootBinarySearch {
    
    /**
     * Find the Floor of Square root of the number
     * @param num
     * @return
     */
    public static int getSquareRoot(int num){
        int low = 0, high = num, res = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            int sMid = mid * mid;
            if(sMid == num){
                return mid;
            }else if(sMid < num){
                low = mid + 1;
                res = mid;
            }else{
                high = mid - 1;
            }
        }
        return res;
    }
}