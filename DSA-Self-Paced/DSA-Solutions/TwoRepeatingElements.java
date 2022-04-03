public class TwoRepeatingElements {
    
    /**
     * Two Repeated Elements
     * You are given an array of N+2 integer elements. 
     * All elements of the array are in range 1 to N. Also, all 
     * elements occur once except two numbers which occur twice. 
     * Find the two repeating numbers.
     * @param arr
     * @param N
     * @return
     */
    public static int[] twoRepeated(int arr[], int N) {
        int[] res = new int[2];
        int index = 0;
        int[] visited = new int[arr.length];
        for (int i = 0; i < N + 2; i++) {
            if (visited[arr[i]] == 1) {
                res[index] = arr[i];
                index++;
            } else {
                visited[arr[i]] = 1;
            }
        }
        return res;
    }
}
