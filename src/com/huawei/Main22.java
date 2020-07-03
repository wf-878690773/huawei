package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入参数：
 * inputString：输入的字符串
 * 返回值：
 * 输出转换好的逆序字符串
 * 输入描述:
 * 输入一个字符串，可以有空格
 * 输出描述:
 * 输出逆序的字符串
 *
 * 输入
 * I am a student
 * 输出
 * tneduts a ma I
 */
public class Main22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        System.out.println(sb.reverse());
    }
}
