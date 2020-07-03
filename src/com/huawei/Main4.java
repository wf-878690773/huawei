package com.huawei;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * 输出描述:
 * 输出到长度为8的新字符串数组
 */
public class Main4 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        sub(s1);
        sub(s2);
    }
    public static void sub(String sub){
        StringBuilder sb = new StringBuilder(sub);
        if (sub.length() > 0 && sub.length() <= 8){
            for (int i = 0; i < 8-sub.length(); i++) {
                sb.append(0);
            }
            System.out.println(sb.toString());
        }else {
            String substring = sub.substring(0, 8);
            System.out.println(substring);
            //递归
            sub(sub.substring(8));
        }
    }
}
