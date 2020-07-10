package com.tracy.practice.array.tracy20200508;

import java.util.Set;
import java.util.TreeSet;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/8 9:57
 */
public class RemoveDupilcates {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDupilcates(nums));
    }

    public static int removeDupilcates(int [] nums){

        int length;

        Set<Integer> set = new TreeSet<>();


        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        length = set.size();

        int nums2 [] = new int[length];

        int i = 0;
        for (Integer num:
             set) {
            nums2[i] = num;
            i++;
        }

        return length;
    }
    /**
     * 优化 :双指针的思想
     */
    public static int removeDupilicate(int [] nums){

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
