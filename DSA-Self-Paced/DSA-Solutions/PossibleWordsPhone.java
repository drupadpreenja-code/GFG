import java.util.*;

public class PossibleWordsPhone {
    
    public static String[] allStrings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    /**
     * Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], 
     * the task is to list all words which are possible by pressing these numbers.
     * Input: N = 3, a[] = {2, 3, 4} 
     * Output: adg adh adi aeg aeh aei afg afh afi  
     * bdg bdh bdi beg beh bei bfg bfh bfi 
     * cdg cdh cdi ceg ceh cei cfg cfh cfi 
     * Explanation: When we press 2,3,4 then 
     * adg, adh, adi, ... cfi are the list of 
     * possible words
     * @param a
     * @param N
     * @return
     */
    public static ArrayList<String> possibleWords(int a[], int N) {
        return posWords(a, N, 0, "");
    }

    private static ArrayList<String> posWords(int a[], int N, int index, String currentString) {
        ArrayList<String> res = new ArrayList<String>();
        if (index == N) {
            res.add(currentString);
            return res;
        }
        for (int i = 0; i < allStrings[a[index]].length(); i++) {
            res.addAll(posWords(a, N, index + 1, currentString + allStrings[a[index]].charAt(i)));
        }
        return res;
    }
}
