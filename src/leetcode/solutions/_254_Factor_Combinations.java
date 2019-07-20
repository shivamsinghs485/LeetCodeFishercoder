package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 254. Factor Combinations
 *
 * Print all combinations of factors (Ways to factorize)
 * Write a program to print all the combinations of factors of given number n.
 */

public class _254_Factor_Combinations {

    public static class Solution1 {
        public List<List<Integer>> getFactors(int n) {
            List<List<Integer>> result = new ArrayList<>();
            helper(result, new ArrayList<>(), n, 2);
            return result;
        }

        public void helper(List<List<Integer>> result, List<Integer> item, int n, int start) {
            if (n <= 1) {
                if (item.size() > 1) {
                    result.add(new ArrayList<>(item));
                }
                return;
            }

            for (int i = start; i <= n; ++i) {
                if (n % i == 0) {
                    item.add(i);
                    helper(result, item, n / i, i);
                    item.remove(item.size() - 1);
                }
            }
        }
    }
}