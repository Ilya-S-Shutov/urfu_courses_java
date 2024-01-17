package src.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int attemtps = Math.min(first.length(), last.length());

        for (int i = 0; i < attemtps; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result;
            }
            result += first.charAt(i);
        }
        return result;
    }

}


//https://leetcode.com/problems/longest-common-prefix