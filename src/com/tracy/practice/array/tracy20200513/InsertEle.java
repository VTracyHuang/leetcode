package com.tracy.practice.array.tracy20200513;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/13 11:48
 */
public class InsertEle {

    /**
     * 思路：遍历数组，是否有相等的元素 有直接返回相等元素的下标
     *      没有就看比它大的那个数，返回那个数的索引
     */

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        System.out.println(intsertEle2(nums,7));
    }

    public static int insertEle(int [] nums, int num){

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>=num){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 二分查找法
     */
    public static int intsertEle2(int [] nums , int target){

        //简单的二分查找
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //特殊判断
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        //小知识点： java数组的最大长度为int的最大值
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        //此时left = right
        return target <= nums[left] ? left : left + 1;
    }
}
