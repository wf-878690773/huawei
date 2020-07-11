package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *  HJ02字符统计
 * 输入描述:
 * 输入一串字符。
 *
 * 输出描述:
 * 对字符中的
 * 各个英文字符（大小写分开统计），数字，空格进行统计，并按照统计个数由多到少输出,如果统计的个数相同，
 * 则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 *
 * 示例1
 * 输入
 * aadddccddc
 * 输出
 * dca
 */
public class Main16 {
    /**
     * 思路：利用数组的下标
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(fun(line));
        }
    }
    private static String fun(String s){
        char[] chars = s.toCharArray();
        int[] num = new int[200];
        /**
         * num[97]=?, num[98]=?, num[99]=?
         */
        for(char c : chars){
            int i = c;
            num[i]++;
        }
        //记录每个字符出现的次数
        int max = 0;
        for(int i=0;i<num.length;i++){
            while(max<num[i]){
                max = num[i];
            }
        }
        //响应结果
        StringBuilder sb = new StringBuilder();
        while(max != 0){
            for(int i=0;i<num.length;i++){
                if(max == num[i]){
                    sb.append((char)i);
                }
            }
            max--;
        }
        return sb.toString();
    }
}
