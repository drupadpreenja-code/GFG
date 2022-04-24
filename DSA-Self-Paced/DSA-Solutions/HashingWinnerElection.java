import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashingWinnerElection {

    /**
     * Function to return the name of candidate that received maximum votes.
     * If there is tie, print lexicographically smaller name.
     * 
     * @param arr
     * @param n
     * @return
     */
    public static String[] winner(String arr[], int n) {
        String[] res = new String[2];
        List<String> data = Arrays.asList(arr);
        Collections.sort(data);
        HashMap<String, Integer> votes = new HashMap<String, Integer>();
        int max = 0;
        for (String name : data) {
            votes.put(name, votes.getOrDefault(name, 0) + 1);
            max = Math.max(votes.get(name), max);
        }
        for (String name : data) {
            if (votes.get(name) == max) {
                res[0] = name;
                res[1] = max + "";
                return res;
            }
        }
        return res;
    }
}
