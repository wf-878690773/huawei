package com.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 找出给定字符串中大写字符(即'A'-'Z')的个数
 * 接口说明
 * 原型：int CalcCapital(String str);
 * 返回值：int
 *
 * 输入描述:
 * 输入一个String数据
 * 输出描述:
 * 输出string中大写字母的个数
 * 示例1
 * 输入
 * add123#$%#%#O
 * 输出
 * 1
 */
public class Main20 {
    public static void main(String[] args){
        Scanner sac = new Scanner(System.in);

        while(sac.hasNext()){
            String s = sac.nextLine();
            System.out.println(num(s));
        }
    }

    public static int num(String s) {
        char[] c = s.toCharArray();
        int num = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                num++;

            }
        }
        return num;
    }
}
