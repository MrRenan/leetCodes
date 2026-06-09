package io.leetcodes.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var compareTo = target - nums[i];

            if (map.containsKey(compareTo)) {
                return new int[]{map.get(compareTo), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

}