package com.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        StringBuilder sb = new StringBuilder(str);
        HashSet set = new HashSet();
        for(int i=0;i<sb.length();i++){
            set.add(sb.substring(i,i+1));
        }
        System.out.println(set.size());
    }

}