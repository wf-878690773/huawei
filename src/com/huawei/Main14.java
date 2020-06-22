package com.huawei;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 将一个字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 * public static String MarkNum(String pInStr)
 * {
 *
 * return null;
 * }
 * 注意：输入数据可能有多行
 * 输入描述:
 * 输入一个字符串
 *
 * 输出描述:
 * 字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 *
 * 示例1
 * 输入
 *      Jkdi234klowe90a3
 * 输出
 *      Jkdi*234*klowe*90*a*3*
 * */
public class Main14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(MarkNum(s));
        }
    }
    public static String MarkNum(String pInst){
        char[] chars = pInst.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length ; i++) {
            if (Character.isDigit(chars[i])){
                sb.append("*");
                sb.append(chars[i]);
                i++;
                while(i<chars.length && Character.isDigit(chars[i]) ){
                    sb.append(chars[i]);
                    i++;
                }
                i--;
                sb.append("*");
            }else{
                sb.append(chars[i]);
            }
        }

        return sb.toString();
    }
}