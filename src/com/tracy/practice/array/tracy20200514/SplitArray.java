package com.tracy.practice.array.tracy20200514;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/14 11:52
 */
public class SplitArray {

    public static void main(String[] args) {

        int [] nums = {1,4,3,2};
        System.out.println(splitArray(nums));
    }

    /**
     *   首先确定数组的长度 看可以分成几对 计算出n
     *
     *   可以对数组进行排序 ，由小到大
     *
     *   依次两两组合
     *
     *   即求和出最大的值
     */
    public static int splitArray(int [] nums){

        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}
