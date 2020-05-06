package com.tracy.practice.array.tracy20200429;

public class SplitArray {
    public static void main(String[] args) {
        int  nums [] = {0,2,1,-6,6,7,9,-1,2,0,1};
        System.out.println(splitArray(nums));
    }

    //暴力破解法
    public static boolean splitArray(int [] nums){
        boolean flag = false;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int num:nums) {
            sum += num;
        }
        /*for(int i=0, j=nums.length-1;i< nums.length&&j>i+1;i++,j--){
                sum1 += nums[i];
                sum2 += nums[j];
                if(sum1 == sum2 && sum1 == sum-(sum1+sum2)){
                    flag = true;
                    return flag;
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            for (int j =nums.length-1; j>i+1; j--) {
                sum2 += nums[j];
                if(sum1 == sum2 && sum1 == sum-(sum1+sum2)){
                    flag = true;
                    return flag;
                }
            }

            sum2 = 0;
        }
        return flag;
    }

    /**
     * 大佬解答
     */
    public boolean canThreeePaartsEqualSum(int [] A){
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if(sum%3 != 0){
            // 总和不是3的倍数，直接返回false
            return false;
        }

        // 使用双指针,从数组两头开始一起找，节约时间
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];

        // 使用left + 1 < right 的原因，防止只能将数组分成两个部分
        // 例如：[1,-1,1,-1]，使用left < right作为判断条件就会出错
        while(left + 1 < right){
            if(leftSum == sum/3 && rightSum == sum/3){
                // 左右两边都等于 sum/3 ，中间也一定等于
                return true;
            }
            if(leftSum != sum/3){
                // left = 0赋予了初值，应该先left++，在leftSum += A[left];
                leftSum += A[++left];
            }
            if(rightSum != sum/3){
                // right = A.length - 1 赋予了初值，应该先right--，在rightSum += A[right];
                rightSum += A[--right];
            }
        }
        return false;
    }
}
