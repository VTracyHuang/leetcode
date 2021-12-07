package com.tracy.practice.hot.tracy20211207;

import java.util.ArrayList;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/12/7
 */
public class findDispearedNumbers {

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,5,2,1,3,2};
        System.out.println(findDisappearedNumbers(nums));;
    }


        public static  List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            for (int num : nums) {
                int x = (num - 1) % n;
                nums[x] += n;
            }
            List<Integer> ret = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (nums[i] <= n) {
                    ret.add(i + 1);
                }
            }
            return ret;
        }


}
