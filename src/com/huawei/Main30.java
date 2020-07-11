package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 等差数列：
 * 功能:等差数列 2，5，8，11，14。。。。
 *  d = 3
 *  an = a1+(n-1)*d = 2+3n-3 = 3n-1
 *  sn = na1+(d*(n*(n-1)))/2 = 2n + (3 * n(n-1))/2 = (4n+3*n*n-3n)/2 = (3*n*n+n)/2
 * 输入:正整数N >0
 * 输出:求等差数列前N项和
 *
 * 返回:转换成功返回 0 ,非法输入与异常返回-1
 * 本题为多组输入，请使用while(cin>>)等形式读取数据
 */
public class Main30 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!=null){
            int n = Integer.parseInt(str);
            System.out.println((3*n*n+n)/2);
        }
    }
}
