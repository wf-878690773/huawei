package com.huawei;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入描述:
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * 输出描述:
 * 返回多行，处理后的结果
 */
public class Main3 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       //输入随机整数的个数
       int n = scanner.nextInt();
       int [] num = new int[n];
       while (scanner.hasNext()){
            for (int i = 0; i < n ; i++) {
               num[i] = scanner.nextInt();
           }
            //排序
           Arrays.sort(num);
           for (int i = 0; i < n; i++) {
               //去重
               if (i==0 || num[i] != num[i-1])
                   System.out.println(num[i]);
           }
       }

    }
}