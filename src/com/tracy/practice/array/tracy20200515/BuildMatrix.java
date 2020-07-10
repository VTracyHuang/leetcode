package com.tracy.practice.array.tracy20200515;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/15 10:48
 */
public class BuildMatrix {

    public static void main(String[] args) {
            int [][] nums = {{1,2},{3,4}};

        int[][] matrixReshape = MatrixReshape2(nums, 2, 4);
    }

    public static int [][] MatrixReshape(int [] [] nums, int r , int c){

        int count = 0;
        int newnums[][] = new int[r][c];
        List<Integer> list = new ArrayList<>();

        //计算二维数组的元素个数，并依次添加到集合中
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                list.add(nums[i][j]);
                count++;
            }
        }
        //计数，以便依次取出集合元素
        int k = 0;
        //可以重塑（ r*c = 集合元素个数），将集合中的元素依次添加到新二维数组中
        if(count / r == c){
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newnums[i][j] = list.get(k);
                    k++;
                }
            }
            return newnums;
        }

        //不能重塑，返回原数组
        return nums;
    }


    //优化解法:不适用额外的空间
    public static int [][] MatrixReshape2(int [] [] nums, int r , int c){
        int [][] newnums = new int[r][c];
        //特殊判断
        if(nums.length==0||r*c!= nums.length*nums[0].length)  return nums;

        int rows = 0,cols = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {

               // newnums[count / c][count % c] = nums[i][j];     数学计算的替换

                newnums[rows][cols] = nums[i][j];
                cols++;
                if(cols == c){
                    rows++;
                    cols = 0;
                }
            }
        }
        return newnums;
    }
}
