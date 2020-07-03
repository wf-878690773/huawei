package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 多线程
 *
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 输出多个ABCD
 *
 * 示例1
 * 输入
 * 10
 * 输出
 * ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD
 *
 */
public class Main21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) !=null) {
            int n = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append("ABCD");
            }
            System.out.println(sb.toString());
        }
    }
}
