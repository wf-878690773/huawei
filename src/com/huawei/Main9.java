package com.huawei;

import java.util.*;

/**
 *输入描述:
 * 输入一个int型整数
 *
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        //保证不重复
        HashSet set = new HashSet();
        StringBuilder sb = new StringBuilder(str);
        //字符串反转
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (set.add(sb.substring(i,i+1))){
                System.out.print(sb.substring(i,i+1));
            }
        }
    }

}