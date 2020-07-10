package com.tracy.practice.array.tracy20200509;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/9 10:46
 */
public class RemoveTargetEle {

    public static void main(String[] args) {

        int [] nums = {0,1,2,2,3,0,4,2};

        System.out.println(Arrays.toString(removeEle(nums,3)));
    }

    public static int [] removeEle(int [] nums, int val){

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (Integer num:
             list) {
            if(num == val){
                list.remove(num);
            }
        }

        int nums2[]  = new int[list.size()];
        int i = 0 ;

        for (Integer num:
             list) {
            nums2[i] = num;
            i++;
        }

        return nums;
    }

    public static int [] removeEle2(int [] nums, int val){

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==val)
                iterator.remove();
        }
        int i = 0 ;
        for (Integer num:
                list) {
            nums[i] = num;
            i++;
        }

        return nums;
    }

    public static int [] removeEle3(int [] nums, int val){

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return  nums;
    }
}
