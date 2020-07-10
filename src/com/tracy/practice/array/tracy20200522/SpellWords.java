package com.tracy.practice.array.tracy20200522;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/22 16:42
 */
public class SpellWords {


    public static void main(String[] args) {

        String [] words = {"hello","world","leetcode"};
        String str = "welldonehoneyr";
        System.out.println(spellWords(words,str));
    }

    public static int spellWords(String [] words , String str){

        int length = 0;

        String replaceStr = str;
        //依次取出数组中的单词
        for (int i = 0; i < words.length; i++) {
            //每一个单词都把字母拆出来
            String singlewords = words[i];
            boolean flag = true;

            //依次判断字符串中是否包含该单词的所有字母
            for (int j = 0; j < singlewords.length(); j++) {
             /*   String target = String.valueOf(singlewords.charAt(j));
                if(str.contains(target) == false){
                    flag = false;
                    continue;
                }*/

                String target = String.valueOf(singlewords.charAt(j));

                if(str.contains(target)){
                    replaceStr = replaceStr.replaceFirst(target,"");
                }else{
                    flag = false;
                    continue;
                }

            }

            //如果满足条件，则记录下单词的长度
           if(flag){
               length += singlewords.length();
           }
            replaceStr = str;
        }
        return length;
    }

}
