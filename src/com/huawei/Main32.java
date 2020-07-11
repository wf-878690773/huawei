package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * (重点)题目标题：公共字符串计算   !!!!
 *
 * 计算两个字符串的最大公共字串的长度，字符不区分大小写
 * 输入
 *      asdfas
 *      werasdfaswer
 * 输出
 *       6
 */
public class Main32 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        while ((str1 = br.readLine()) != null){
            String str2 = br.readLine();
            System.out.println(getNum(str1,str2));
        }
    }
    public static int getNum(String str1,String str2){

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int[][] num = new int[char1.length][char2.length];

        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == char2[0]){
                num[i][0] = 1;
            }
        }
        for (int j = 1; j < char2.length; j++) {
            if (char2[j] == char1[0]){
                num[0][j] = 1;
            }
        }
        int max = 0;

        for (int i = 1; i < char1.length; i++) {
            for (int j = 1; j < char2.length; j++) {
                if (char1[i] == char2[j]){
                    num[i][j] = num[i-1][j-1] + 1;
                }
                max = Math.max(max,num[i][j]);
            }
        }
        return max;
    }
}
