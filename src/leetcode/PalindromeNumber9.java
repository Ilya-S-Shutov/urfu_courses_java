package src.leetcode;

public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        boolean result;
        if ((x%10 == 0 & x != 0) | (x < 0)) {
            result = false;
        }

        int y = 0;
        int temp = x;
        int last_sym;

        while (temp > 0) {
            last_sym = temp % 10;
            y = y * 10 + last_sym;
            temp /= 10;
        }
        if (x == y) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}

//https://leetcode.com/problems/palindrome-number

