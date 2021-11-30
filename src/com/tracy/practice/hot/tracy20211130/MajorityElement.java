package com.tracy.practice.hot.tracy20211130;

import java.util.Arrays;

/**
 * created by huangyating
 *  找到出现次数大于n/2的数
 * @Date 2021/11/30
 */
public class MajorityElement {


    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
