package com.tracy.practice.array.tracy20200428;

/**
 *
 *
 *
 *
 *
 */
public class CalMusicTime {

    public static void main(String[] args) {
        int [] times = {30,20,150,100,40};
        System.out.println(CountMusic(times));
        System.out.println(CountMusic2(times));
    }
    //暴力破解法(超出时间限制)
    public static int CountMusic(int [] times){
        int count = 0;      //用于music 计数
        for (int i = 0; i < times.length; i++) {
            for (int j = i+1; j < times.length; j++) {
                if((times[i]+times[j]) % 60 == 0 ){
                    count++;
                }
            }
        }
        return count;
    }

    //余数求解法
    public static int CountMusic2(int [] times){
        int count = 0;
        int mod [] = new int [60];
        for (int i = 0; i < times.length; i++) {
            mod[times[i]%60]++;
        }
        for (int i = 1;i < 30;i++){
            count += mod[i]*mod[60-i];
        }
        count+=(mod[0]*(mod[0]-1)+mod[30]*(mod[30]-1))/2;
        return count;
    }

    //余数求解法优化
    public static int CountMusic3(int [] times){
        int count = 0;

        return count;
    }

}
