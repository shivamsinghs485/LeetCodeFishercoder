package leetcode.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * <p>
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 */
public class _345_Reverse_Vowels_of_a_String {
    public static class Solution1 {
        public String reverseVowels(String s) {
            StringBuilder sb = new StringBuilder(s);
            Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
            //use two pointers approach would be the fastest
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                char left = s.charAt(i);
                char right = s.charAt(j);
                while (i < j && !vowels.contains(left)) {
                    i++;
                    left = s.charAt(i);
                }
                while (i < j && !vowels.contains(right)) {
                    j--;
                    right = s.charAt(j);
                }
                char temp = left;
                sb.setCharAt(i, right);
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            return sb.toString();
        }
    }
}
