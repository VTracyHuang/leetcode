package com.tracy.practice.hot.tracy20211203;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by huangyating
 *
 * @Date 2021/12/3
 */
public class letterCombination {

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));;

    }

    public static List<String> letterCombinations(String digits){

        List<String> combinations = new ArrayList<>();

        int index = 0;

        //特判
        if(digits.length() == 0){
            return combinations;
        }
        //定义电话字典
        Map<Character,String> map = new HashMap<Character, String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");

        }};
        StringBuilder combination = new StringBuilder();
        backtrack(combinations,index,map,digits,combination);
        return combinations;
    }

    private static void backtrack(List<String> combinations, int index, Map<Character, String> map, String digits,StringBuilder combination) {
        if(combination.toString().length() == digits.length()){
            combinations.add(combination.toString());
        }else{
            //获取当前字符
            char curDigit = digits.charAt(index);
            //获取当前字符所对应的字母
            String curAlphabet = map.get(curDigit);
            char[] curAlphabets = curAlphabet.toCharArray();
            for (int i = 0; i < curAlphabets.length; i++) {
                combination.append(curAlphabets[i]);
                backtrack(combinations,index + 1,map,digits,combination);
                combination.deleteCharAt(index);
            }
        }
    }
}

