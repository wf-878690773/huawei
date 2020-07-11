package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * HJ46: 按字节截取字符串
 *
 * 输入描述: 输入待截取的字符串及长度
 *
 * 输出描述: 截取后的字符串
 * 输入
 *      我ABC汉DEF
 *      6
 * 输出
 *      我ABC
 */
public class Main38 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null){
            int num = Integer.parseInt(br.readLine());
            char[] chars = str.toCharArray();
            int index = 0;
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                int c =(int) str.charAt(i);
                index++;
                if (c < 128){
                    count += 1;
                    if (count == num){
                        System.out.println(str.substring(0,index));
                        break;
                    }
                }else {
                    count += 2;
                    if (count == num){
                        System.out.println(str.substring(0,index));
                        break;
                    }else if(count > num){
                        System.out.println(str.substring(0,index-1));
                        break;
                    }
                }
            }

        }
    }

}
