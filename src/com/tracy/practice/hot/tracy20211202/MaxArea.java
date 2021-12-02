package com.tracy.practice.hot.tracy20211202;

/**
 * created by huangyating
 * 盛水最多的容器
 * @Date 2021/12/2
 */
public class MaxArea {


    public static void main(String[] args) {

    }

    public static int maxArea(int [] height){
        int l = 0,r = height.length - 1;
        int ans = 0,area = 0;
        while(l < r){
            area = Math.min(height[l],height[r]) * (r - l);
            ans = Math.max(ans,area);
            if(height[l] < height[r]){
                ++l;
            }else{
               --r;
            }
        }
        return ans;
    }
}
