import java.util.*;

public class SubsetSumProblem {

    /**
     * Get the number of Subset with Sum provided
     * @param subset
     * @param sum
     * @return
     */
    public static Integer getNumberofSubsetWithSum(ArrayList<Integer> subset, Integer sum) {
        return getNumberofSubset(subset, sum, subset.size());
    }

    private static Integer getNumberofSubset(ArrayList<Integer> subset, Integer sum, Integer number) {
        if (number == 0) {
            return sum == 0 ? 1 : 0;
        }
        return getNumberofSubset(subset, sum, number - 1)
                + getNumberofSubset(subset, sum - subset.get(number - 1), number - 1);
    }
}
