package com.huawei;

import apple.laf.JRSUIUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 整形数组合并
 * 输入描述:
 * 输入说明，按下列顺序输入：
 * 1 输入第一个数组的个数
 * 2 输入第一个数组的数值
 * 3 输入第二个数组的个数
 * 4 输入第二个数组的数值
 *
 * 输出描述:
 * 输出合并之后的数组
 * 输入
 *      3
 *      1 2 5
 *      4
 *      -1 0 3 2
 * 输出
 *      -101235
 */
public class Main34 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null){

            int n = Integer.parseInt(str);
            String[] a = br.readLine().split(" ");
            int m = Integer.parseInt(br.readLine());
            String[] b = br.readLine().split(" ");
            TreeSet<Integer> set = new TreeSet();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i < n;i++){
                set.add(Integer.parseInt(a[i]));
            }
            for(int i=0;i < m;i++){
                set.add(Integer.parseInt(b[i]));
            }
            for(Integer s:set){
                sb.append(s);
            }
            System.out.println(sb.toString());
        }
    }
}
