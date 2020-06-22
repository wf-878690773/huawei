package com.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 * 详细描述：
 * 函数接口说明：
 * public String getResult(long ulDataInput)
 * 输入参数：
 * long ulDataInput：输入的正整数
 * 返回值：
 * String
 */
public class Main6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Long lon = Long.valueOf(s);
        getResult(lon);
    }
    public static void getResult(long lon){
        for (int i = 2; i <= lon; i++) {
            if (lon%i == 0){
                System.out.print(i + " ");
                getResult(lon/i);
                break;
            }
            if (i==lon){
                System.out.print(i + " ");
            }
        }
    }

}