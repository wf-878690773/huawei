package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 题目：字符串最后一个单词的长度
 *
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Main1{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine())!= null){
            String[] s = str.split(" ");
            int len = s[s.length - 1].length();
            System.out.println(len);
        }

    }
}
