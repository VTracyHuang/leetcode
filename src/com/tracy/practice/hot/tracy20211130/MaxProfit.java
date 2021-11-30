package com.tracy.practice.hot.tracy20211130;

/**
 * created by huangyating
 *  买卖股票的最佳时机
 * @Date 2021/11/30
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        //动态规划
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i : prices){
            minPrice = (i < minPrice) ? i:minPrice;
            maxProfit = ((i - minPrice) > maxProfit)? i-minPrice:maxProfit;
        }
        return maxProfit;
    }
}
