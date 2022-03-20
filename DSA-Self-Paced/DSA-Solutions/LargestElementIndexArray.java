public class LargestElementIndexArray {
    
    /**
     * Program to Find the index of Largest element in an Array
     * @param arr
     * @return
     */
    public static int getLargestElementIndex(Integer[] arr){
        if(arr.length < 0 ){
            return -1;
        }
        Integer result = 0;
        for(Integer i = 1 ; i < arr.length ; i++){
            if(arr[result] < arr[i]){
                result = i;
            }
        }
        return result;
    }
}
