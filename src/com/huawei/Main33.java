package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 题目：百钱买百鸡
 * 题目描述
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 *
 */
public class Main33 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null){
            int a , b;
            for(a=0;a<20;a++){
                for(b=0;a+b<100;b++){
                    int c = 100-a-b ;
                    if(c==(100 - 5*a - 3*b)*3){
                        System.out.println(a+" "+b+" "+c);
                    }
                }
            }

        }
    }
}
