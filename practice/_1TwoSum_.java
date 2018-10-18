package com.easy;

import java.util.HashMap;

/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* Given nums = [2, 7, 11, 15], target = 9,
* Because nums[0] + nums[1] = 2 + 7 = 9,
* return [0, 1].
* */
public class _1TwoSum_ {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementSet= new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementSet.containsKey(complement)) {
                result[0] = complementSet.get(complement);
                result[1] = i;
                break;
            }
            complementSet.put(nums[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        nums = _1TwoSum_.twoSum(nums, 18);
        System.out.println(nums[0] + " " + nums[1]);
    }
}
