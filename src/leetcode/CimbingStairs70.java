package src.leetcode;

public class CimbingStairs70 {
    public int climbStairs(int n) {
        int prevStep = 1;
        int currStep = 1;
        int temp;

        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            temp = currStep;
            currStep = prevStep + currStep;
            prevStep = temp;
        }
        return currStep;
    }
}

/*
https://leetcode.com/problems/climbing-stairs/description/
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
