package com.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 找出字符串中第一个只出现一次的字符
 * 输入描述:
 * 输入一个非空字符串
 * 输出描述:
 * 输出第一个只出现一次的字符，如果不存在输出-1
 *
 * 示例1
 * 输入: asdfasdfo
 * 输出: o
 */
public class Main18 {
    /**
     * 思路：数组的下标唯一性
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            fun(scanner.nextLine());
        }
    }
    public static void fun(String s){
        char[] chars = s.toCharArray();
        int[] num = new int[128];
        for (int i = 0; i < chars.length; i++) {

            num[s.charAt(i)]++;
        }
        for (int i = 0; i < chars.length; i++) {

            if (num[chars[i]]==1){
                System.out.println(chars[i]);
                break;
            }
            if (i==chars.length-1){
                System.out.println("-1");
            }
        }
    }
}
