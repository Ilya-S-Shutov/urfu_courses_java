package src.leetcode;

import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen_values = new HashMap<>();
        int num_2;
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            num_2 = target - nums[i];
            if (seen_values.containsKey(num_2)){
                result[0] = i;
                result[1] = seen_values.get(num_2);
            } else {
                seen_values.put(nums[i], i);
            }

        }
        return result;
    }

}

// https://leetcode.com/problems/two-sum