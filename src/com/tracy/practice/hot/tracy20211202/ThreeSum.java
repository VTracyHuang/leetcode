package com.tracy.practice.hot.tracy20211202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by huangyating
 * 三数之和
 * @Date 2021/12/2
 */
public class ThreeSum {

    public static void main(String[] args) {

    }

    //特例排除，nums == null || nums.length < 3
    //对nums进行排序

    //遍历数组 数组i 定义i后的左右指针
    //特例排除，nums[i] > 0
    //和大于0 右指针左移 和小于0 左指针右移
    //为避免答案重复，如果i重复，则跳过;如果左右指针值重复，则跳过
    public static List<List<Integer>> threeAdd(int [] nums){
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        int sum = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break;
            int L = i + 1;
            int R = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]) continue;  //去重
            while (L < R){
                sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L] == nums[L+1]) L++;
                    while (L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if(sum < 0){
                    L++;
                }
                else if(sum > 0){
                    R--;
                }
            }
        }
        return ans;
    }
}
