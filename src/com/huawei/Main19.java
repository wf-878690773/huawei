package com.huawei;

import java.util.Scanner;

/**
 * 输入描述:
 * 输入两个字符串。第一个为短字符，第二个为长字符。
 *
 * 输出描述:
 * 返回值：
 *
 * 示例1
 * 输入:
 * bc
 * abc
 * 输出:true
 */
public class Main19 {
    /**
     * ?????
     * @param args
     */
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        while(sca.hasNext()){
            String s1 = sca.nextLine();
            String s2 = sca.nextLine();
            boolAllCharExist(s1,s2);
        }

    }
    public static void boolAllCharExist(String shortString,String longString){
        int i;
        for (i = 0; i < shortString.length(); i++) {
            if (longString.indexOf(shortString.charAt(i)) == -1) {
                System.out.println(false);
                i--;
                break;
            }
        }
        if (i == shortString.length()) {
            System.out.println(true);
        }
    }
}
