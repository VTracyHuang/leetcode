package com.tracy.practice.array.tracy20200522;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/22 10:17
 */
public class CalArray {
    public static void main(String[] args) {

        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(calArray(nums));
    }

    /**
     * 实现功能描述:
     *      思路：以一个指针作为分隔点，分别计算指针左边和右边的所有数的和
     *            然后指针分别后移
     * @param nums
     * @return int
     * @Author: Tracy
     * @Date : 2020/5/22 10:22
     */
    public static int calArray(int nums []){

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int max =  0;

        for (int num: nums) {
            sum+=num;
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j <= i;j++) {
                sum1 +=  nums[j];
            }

            sum2 = sum - sum1;

            int a = (sum1>sum2) ? sum1:sum2;

            max = (max>a) ? max:a;

        }
        return max;
    }
}
