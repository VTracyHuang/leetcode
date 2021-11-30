package com.tracy.practice.hot.tracy20211130;

/**
 * created by huangyating
 * 最大子序集
 * @Date 2021/11/30
 */
public class MaxSubArray {

    public static void main(String[] args) {

    }
    public static int maxSubArray(int [] arr) {
        //动态规划的思想
        int maxAnswer = arr[0];
        int pre = 0;
        for (int i : arr) {
            pre = Math.max(pre + i,i);
            maxAnswer = Math.max(maxAnswer,pre);
        }
        return maxAnswer;
    }
}
