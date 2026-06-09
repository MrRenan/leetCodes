package io.leetcodes.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    @DisplayName("Given input: nums = [2,7,11,15], target = 9, should return [0, 1]")
    void shouldReturnZeroAndOneWhenTargetIsNine(){
        // ARRANGE
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;
        var expected = new int[]{0, 1};

        // ACT
        int[] result = new TwoSum().twoSum(nums, target);

        // ASSERT
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given input: nums = [3,2,4], target = 6, should return [1,2]")
    void shouldReturnOneAndTwoWhenTargetIsSix(){
        // ARRANGE
        var nums = new int[]{3,2,4};
        var target = 6;
        var expected = new int[]{1,2};

        // ACT
        int[] result = new TwoSum().twoSum(nums, target);

        // ASSERT
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given input: nums = [3,3], target = 6, should return [0,1]")
    void shouldHandleDuplicatedValues(){
        // ARRANGE
        var nums = new int[]{3,3};
        var target = 6;
        var expected = new int[]{0,1};

        // ACT
        int[] result = new TwoSum().twoSum(nums, target);

        // ASSERT
        Assertions.assertArrayEquals(expected, result);
    }

}