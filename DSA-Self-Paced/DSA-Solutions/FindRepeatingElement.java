public class FindRepeatingElement {
    
    /**
     * Find the Repeating Element in the array
     * Array Size n >= 2
     * only one element repeats (Any number of times)
     * All the elements from 0 to max(arr) are present
     * 0 <= max(arr) <= n-2
     * @param arr
     * @return
     */
    public static int getRepeatingElement(int arr[]){
        Boolean[] visited = new Boolean[arr.length];
        for(int i = 0; i < arr.length ; i ++){
            if(!visited[arr[i]]){
                visited[arr[i]] = true;
            }else{
                return arr[i];
            }
        }
        return -1;
    }

    /**
     * Efficient Solution
     * @param arr
     * @return
     */
    public static int getRepeatingElement2(int arr[]){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
