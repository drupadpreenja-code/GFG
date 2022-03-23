public class MajorityElement {

    /**
     * Find the index of majority element in the array if any majority exist 
     * @param arr
     * @return
     */
    public static int majorityElement(int[] arr){
        int count = 1 ;
        int res = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[res] == arr[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0 ){
                count = 1;
                res = i;
            }
        }

        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count > (arr.length / 2)){
            return res;
        }
        return -1;
    }
}
