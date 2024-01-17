package src.leetcode;

import java.util.HashMap;

public class RomanToInteger13 {
    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> dictNum = new HashMap<>();
        dictNum.put('I', 1);
        dictNum.put('V', 5);
        dictNum.put('X', 10);
        dictNum.put('L', 50);
        dictNum.put('C', 100);
        dictNum.put('D', 500);
        dictNum.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                result += dictNum.get(s.charAt(i));
            } else if (dictNum.get(s.charAt(i)) < dictNum.get(s.charAt(i + 1))) {
                result -= dictNum.get(s.charAt(i));
            } else {
                result += dictNum.get(s.charAt(i));
            }
        }

        return result;
    }
}
