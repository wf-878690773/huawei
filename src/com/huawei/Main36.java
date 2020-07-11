package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 题目：找出字符串中第一个只出现一次的字符
 * 输入描述: 输入一个非空字符串
 * 输出描述:输出第一个只出现一次的字符，如果不存在输出-1
 *
 * 输入
 *      asdfasdfo
 * 输出
 *      o
 */
public class Main36 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null){

            int[] num = new int[128];

            char[] c = str.toCharArray();
            // 将字符存入数组下标中
            for(int i=0;i<str.length();i++){
                num[c[i]]++;
            }
            for (int i = 0; i < str.length(); i++) {
                if(num[c[i]] == 1){
                    System.out.println(c[i]);
                    break;
                }
                if (i == str.length()-1){
                    System.out.println("-1");
                }
            }
        }
    }
}
