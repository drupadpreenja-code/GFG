public class RearrangeArrayAlternately {
    
    /**
     * Rearrange  the array elements alternatively i.e first element 
     * should be max value, second should be min value, third should 
     * be second max, fourth should be second min and so on.
     * @param arr
     * @return
     */
    public static int[] rearrange(int[] arr){
        int[] resArr = new int[arr.length];
        int i = 0, j = arr.length - 1, k = 0;
        
        while(i < j){
            resArr[k] = arr[j];
            k++;
            resArr[k] = arr[i];
            k++;
            i++;
            j--;
        }
        if(i == j){
            resArr[arr.length - 1] = arr[i];
        }
        return resArr;
    }
}
