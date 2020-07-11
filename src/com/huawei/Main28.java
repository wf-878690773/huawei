package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 *
 *
 */
public class Main28 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine())!=null){
            char[] chars = str.toCharArray();

            int getEnglishCharCount = 0;
            int getBlankCharCount = 0;
            int getNumberCharCount = 0;
            int getOtherCharCount = 0;

            for (int i = 0; i < chars.length ; i++) {
                if ((chars[i] <= 'z' && chars[i] >= 'a')||(chars[i] <= 'z' && chars[i] >= 'a')){
                    getEnglishCharCount++;
                }else if ((chars[i] == ' ' )){
                    getBlankCharCount++;
                }else if ((chars[i] <= '9' && chars[i] >= '0')){
                    getNumberCharCount++;
                }else {
                    getOtherCharCount++;
                }
            }
            // 英文
            System.out.println(getEnglishCharCount);
            // 空格
            System.out.println(getBlankCharCount);
            // 数字
            System.out.println(getNumberCharCount);
            // 其他
            System.out.println(getOtherCharCount);

        }
    }
}
