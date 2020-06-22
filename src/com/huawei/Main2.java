package com.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，
 * 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = scanner.nextLine();
        String[] split = str.split("");
        int count=0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase(s) ){
                count++;
            }
        }
        System.out.println(count);

    }
}