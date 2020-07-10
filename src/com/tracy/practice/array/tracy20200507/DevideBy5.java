package com.tracy.practice.array.tracy20200507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 10:53
 */
public class DevideBy5 {

    public static void main(String[] args) {
        int [] nums = {0,1,1,1,1,1};

        prefixesDivBy52(nums);
        System.out.println(Arrays.toString(DevideBy5(nums)));
    }

    public static boolean [] DevideBy5(int [] nums){

        boolean [] results = new boolean[nums.length];

        int num = 0;

        if(nums[0] == 0){
            results[0] = true;
        }else{
            results[0] = false;
            num+=1;
        }
        for (int i = 1; i < nums.length; i++) {
            num += Math.pow(nums[i],i);
            if(num%5 == 0){
                results[i] = true;
            }else{
                results[i] = false;
            }
        }
        return results;
    }


    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int state =0;
        for(int i=0;i<A.length;i++){
            state = ((state<<1)+A[i])%5;
            if(state==0) ans.add(Boolean.TRUE);
            else ans.add(Boolean.FALSE);
        }
        return ans;
    }
    public static List<Boolean> prefixesDivBy52(int[] A) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = num << 1 + A[i];
            ans.add(num%5 == 0);
        }
        return ans;
    }
}
