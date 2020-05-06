package com.tracy.demo.tracy20200423;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 嵌套循环，找出和为target的两个数，记录下它们的下标，并存入新数组中
 * 输出数组中的元素
 */
public class PickArrayForSum {
    public static void main(String[] args) {
        Integer[] nums = {2, 7, 11, 15};
        int target = 9;
        scanArray(nums, target);
    }

    /*遍历数组*/
    public static Integer[] scanArray(Integer[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   /* Integer [] indexs = new Integer[2];
                    indexs[0] = i;
                    indexs[1] = j;
                    Arrays.asList(indexs).forEach(System.out::println);*/
                    return new Integer[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*遍历数组*/
    public static Integer[] scanArray2(Integer[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment) && map.get(compliment) != i) {
                return new Integer[]{i, map.get(compliment)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*遍历数组*/
    public static Integer[] scanArray3(Integer[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new Integer[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
