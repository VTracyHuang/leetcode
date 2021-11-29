package com.tracy.practice.hot.tracy20211129;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * created by huangyating
 *
 * @Date 2021/11/29
 */
public class ValidBracket {

    public static void main(String[] args) {
        String target = "{[)(]}";
        System.out.println(isValidBracket(target));
    }

    public static boolean isValidBracket(String target){
        int len = target.length();
        //判断长度，奇数必为false
        if(len % 2 == 1){
            return false;
        }
        //使用栈，先进后出
        //定义括号字典
        Map<Character,Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            char c = target.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != pairs.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
