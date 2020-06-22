package com.huawei;


import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 *输入描述:
 * 将一个英文语句以单词为单位逆序排放。
 *
 * 输出描述:
 * 得到逆序的句子
 * */
public class Main11 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        System.out.print(reverse(s));
    }

    public static String reverse(String sentence){
        String[] st = sentence.trim().split(" ");

        StringBuffer sb = new StringBuffer();
        for(int i=st.length-1;i>=0;i--){
            sb.append(st[i]).append(" ");
        }
        return sb.toString();
    }

}