package com.huawei;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Main1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sca = scanner.nextLine();
        String[] s = sca.split(" ");
        int length = s[s.length - 1].length();
        System.out.println(length);
    }
}