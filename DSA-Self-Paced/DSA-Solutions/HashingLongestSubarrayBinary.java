import java.util.HashMap;

public class HashingLongestSubarrayBinary {
    
    /**
     * Program to find the Lonest Subarray with equal 0s and 1s
     * @param arr
     * @return
     */
    public static int getLength(int arr[]){
        int res = 0, preSum = 0;
        HashMap<Integer, Integer> main = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        for(int i = 0; i < arr.length ; i++){
            preSum += arr[i];
            if(preSum == 0){
                res = i+1;
            }
            if(main.containsKey(preSum + arr.length) == false){
                main.put(preSum + arr.length, i);
            }
            if(main.containsKey(preSum + arr.length) == true){
                res = Math.max(res, i - main.get(preSum + arr.length));
            }
        }
        return res;
    }
}
