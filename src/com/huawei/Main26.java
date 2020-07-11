package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * HJ101: 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 输入描述:
 * 1、输入需要输入的整型数个数
 *
 * 输出描述:
 * 输出排好序的数字
 *
 * 示例1
 * 输入
 * 8
 * 1 2 4 9 3 55 64 25
 * 0
 * 输出
 * 1 2 3 4 9 25 55 64
 */
public class Main26 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!= null){
            int n = Integer.parseInt(str);
            String[] sort = br.readLine().split(" ");
            // 字符数组 -> int数组
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(sort[i]);
            }
            int flag = Integer.parseInt(br.readLine());
            sort(num,flag);
        }
    }
    public static void sort(int[] sort,int flag){
        Arrays.sort(sort);
        StringBuilder sb = new StringBuilder();
        if(flag == 0){
            for (int i = 0; i < sort.length; i++) {
                sb.append(sort[i]).append(" ");
            }
        }else{
            for(int i=sort.length-1;i>=0;i--){
                sb.append(sort[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
