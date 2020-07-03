package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目：统计每个月兔子的总数
 * 题目描述
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 1  1
 * 2  1
 * 3  1+1 2
 * 4  1+1+1 3
 * 5  1+1+1+1+1 5
 * 6  1+1+1+1+1+1+1+1 8
 * 7  1+1+1+1+1+1+1+1+1+1+1+1 13
 * 8  1+1+1+1+1+1+1+1+1+1+1+1...  21
 * 9                                 34
 */
public class Main24 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine())!=null){
            System.out.println(getTotalCount(Integer.parseInt(str)));
        }

    }
    public static int getTotalCount(int monthCount) {
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i=2;i<monthCount;++i)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
}
