package com.huawei;


import java.io.IOException;
import java.util.Scanner;

/**
 * 输入描述:
 * 输入一个字符串。
 *
 * 输出描述:
 * 输出字符串中最长的数字字符串和它的长度。如果有相同长度的串，则要一块儿输出，但是长度还是一串的长度
 *
 * 示例1
 * 输入
 * abcd12345ed125ss123058789
 *
 * 输出
 * 123058789,9
 * */
public class Main15 {
    /**
     * ？？？
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int [] len = new int[chars.length];

        int start = 0;
        boolean flag = false;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i])) {

                start = i;
            }else{

                len[start] = i-start;

                max = (i-start) > max?(i-start):max;

            }

        }
    }

}