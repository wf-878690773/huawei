package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 根据输入的日期，计算是这一年的第几天。。
 * 详细描述：
 * 输入某年某月某日，判断这一天是这一年的第几天？。
 *  输入
 *      2012
 *      12
 *      31
 * 输出
 *      366
 */
public class Main31 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null){
            String[] s = str.split(" ");
            int year = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            int day = Integer.parseInt(s[2]);
            System.out.println(getDay(year,month,day));
        }

    }
    public static int getDay(int year,int month,int day){

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int count = 0;
        if (year % 4 == 0 && ( year % 100 !=0 || year % 400 == 0)){
            days[1] = 29;
        }
        if (month<=12){
            for (int i = 0; i < month-1; i++) {
                count += days[i];
            }
        }
        count += day;
        return count;
    }
}
