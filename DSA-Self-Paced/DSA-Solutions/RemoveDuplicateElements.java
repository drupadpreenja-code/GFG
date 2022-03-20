public class RemoveDuplicateElements {
    
    /**
     * Remove Duplicate from a Sorted array and return size
     * @param arr
     * @return
     */
    public static int removeDuplicate(int[] arr){

        int res = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
