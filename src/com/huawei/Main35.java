package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 密码强度等级
 */
public class Main35 {
    public static void main(String[] agrs) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine()) != null){
            getPwdSecurityLevel(str);
        }
    }
    public static void getPwdSecurityLevel(String str){
        int count = 0;
        // 1.密码长度
        if(str.length()<=4){
            count += 5;
        }else if(str.length()>=5 && str.length()<=7){
            count += 10;
        }else if(str.length()>=8){
            count += 25;
        }
        int lower = 0;
        int upper = 0;
        int number = 0;
        int other = 0;
        char[] c = str.toCharArray();
        for(int i=0;i < c.length;i++){
            if(c[i]<='Z' && c[i]>='A'){
                ++lower;
            }else if(c[i]<='z' && c[i]>='a'){
                ++upper;
            }else if(c[i]<='9' && c[i]>='0'){
                ++number;
            }else{
                ++other;
            }
        }
        // 2.字母
        if(lower==c.length||upper==c.length){
            count += 10;
        }else if(lower>0 && upper>0){
            count += 20;
        }
        // 3.数字
        if(number > 1){
            count += 20;
        }else if(number == 1){
            count += 10;
        }
        // 4.符号
        if(other>1){
            count += 25;
        }else if(other == 1){
            count += 10;
        }
        // 奖励
        if(number>0&&(lower>0||upper>0)){
            count += 2;
        }else if(number>0 && (lower>0||upper>0) && other>0){
            count += 3;
        }else if(number>0 && lower>0 && upper>0 && other>0){
            count += 5;
        }

        if(count >= 90){
            System.out.println("VERY_SECURE");
        }else if(count >= 80){
            System.out.println("SECURE");
        }else if(count >= 70){
            System.out.println("VERY_STRONG");
        }else if(count >= 60){
            System.out.println("STRONG");
        }else if(count >= 50){
            System.out.println("AVERAGE");
        }else if(count >= 25){
            System.out.println("WEAK");
        }else {
            System.out.println("VERY_WEAK");
        }

    }
}
