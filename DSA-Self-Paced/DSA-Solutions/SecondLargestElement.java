public class SecondLargestElement {
    
    /**
     * Program to Find the index of Second Largest element in an Array
     * @param arr
     * @return
     */
    public static int getSecondLargestElementIndex(Integer[] arr){
        if(arr.length < 1 ){
            return -1;
        }
        Integer largest = 0;
        Integer second = -1;
        for(Integer i = 1 ; i < arr.length ; i++){
            if(arr[largest] < arr[i]){
                second = largest;
                largest = i;
            }else if(second != -1 && arr[second] < arr[i]){
                second = i;
            }
        }
        return second;
    }
}
