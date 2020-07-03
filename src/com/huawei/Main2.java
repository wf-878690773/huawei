package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 题目：计算字符个数
 * 写出一个程序，接受一个由字母和数字组成的字符串，
 * 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        String s = br.readLine();
        int count=0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase(s)){
                count++;
            }
        }
        System.out.println(count);

    }
}
