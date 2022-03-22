public class TrappingRailWater {
    
    public static int trapWaterQty(int[] arr){
        int res = 0, lmax = 0, rmax = 0;
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i ++){
            lmax = Math.max(lmax, arr[i]);
            leftMax[i] = lmax;
            rmax = Math.max(rmax, arr[arr.length - 1 - i]);
            rightMax[arr.length - 1 - i] = rmax;
        }
        for(int i = 1; i < arr.length - 1 ; i ++){
            if(leftMax[i] > rightMax[i]){
                res += rightMax[i] - arr[i];
            }else{
                res += leftMax[i] - arr[i];
            }
        }
        return res;
    }
}
