public class StockBuySellProblem {
    
    /**
     * Find the Maximum profit
     * Solution : We have to find the Peaks only
     * @param arr
     * @return
     */
    public static int maxProfit(int[] arr){
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                res += arr[i] - arr[i - 1];
            }
        }
        return res;
    }
}