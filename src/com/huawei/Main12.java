package com.huawei;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * */
public class Main12 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int num =Integer.parseInt(sca.nextLine());
        ArrayList<String> list = new ArrayList();
        for(int i=0;i<num;i++){
            String str = sca.nextLine();
            list.add(str);
        }
        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }

    }

}