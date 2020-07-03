package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 投票
 */
public class Main25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null){
            // 候选人人数
            int n = Integer.parseInt(str);
            // 候选人姓名
            String[] name = br.readLine().split(" ");
            // 投票人数
            int num = Integer.parseInt(br.readLine());
            // 投票
            String[] str2 = br.readLine().split(" ");
            // 开始投票
            int[] count = new int[n];
            // 候选人站好
            for (int i = 0; i < n; i++) {
                // 投票人开始投票
                for (int j = 0; j < num ; j++) {
                    // 投票中
                    if(str2[j].equals(name[i])){
                        count[i]++;
                    }
                }
            }
            // 其他选票
            int other = num;
            for (int i = 0; i < n ; i++) {
                other -= count[i];
                System.out.println(name[i]+"："+count[i]);
            }
            System.out.println("Invalid：" + other);
        }

    }
}
