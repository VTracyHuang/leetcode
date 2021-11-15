package com.tracy.practice.hot.tracy20211115;

import java.util.HashSet;
import java.util.Set;

/**
 * created by huangyating
 * 计算字符串中出现的最长无重复字符子串长度
 *
 * @Date 2021/11/15
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String str = "absjkhauuckxno";
        System.out.println(lengthOfLongestSubstring(str));;
    }

    public static int lengthOfLongestSubstring(String s) {
        //Hash集合，用于统计字符是否重复出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        //定义指针
        int rk = -1,ans = 0;
        for (int i = 0; i < n; i++) {
            if(i != 0){
                occ.remove(s.charAt( i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }
}
