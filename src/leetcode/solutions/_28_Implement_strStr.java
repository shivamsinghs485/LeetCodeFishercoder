package leetcode.solutions;

/**
 * 28. Implement strStr()
 * <p>
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class _28_Implement_strStr {

    public static class Solution1 {
        public int strStr(String haystack, String needle) {
            if (haystack == null || needle == null || haystack.length() < needle.length()) {
                return -1;
            }

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }

}
