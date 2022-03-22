public class LengthOfLongestEvenOddSubarray {
    
    /**
     * Length of the longest sub array that have 
     * alternating even odd elements
     * @param arr
     * @return
     */
    public static int maxLen(int[] arr){
        int res = 1;
        for(int i = 1 ; i < arr.length; i ++){
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) 
                || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)){
                    res++;
            }else{
                res = 1;
            }
        }
        return res;
    }
}
