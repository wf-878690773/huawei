package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main37 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null){
            char[] c = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i < c.length;i++){
                if(c[i] >= 'A' && c[i] <= 'Z'){
                    char c1 = Character.toLowerCase(c[i]);
                    if(c1 =='z'){
                    sb.append("a  ");
                    }else{
                        sb.append((char)(Integer.valueOf(c1)+1));
                    }
                }else if(c[i] >= 'a' && c[i] <= 'z'){
                    sb.append(upper(c[i]));
                }else{
                    sb.append(c[i]);
                }
            }
            System.out.println(sb);
        }

    }

    public static String upper(char c){
        if(c >= 'a' && c <= 'c'){
            return "2";
        }else if(c >= 'd' && c <= 'f'){
            return "3";
        }else if(c >= 'g' && c <= 'i'){
            return "4";
        }else if(c >= 'j' && c <= 'l'){
            return "5";
        }else if(c >= 'm' && c <= 'o'){
            return "6";
        }else if(c >= 'p' && c <= 's'){
            return "7";
        }else if(c >= 't' && c <= 'v'){
            return "8";
        }else if(c >= 'w' && c <= 'z'){
            return "9";
        }
        return "1";
    }
}
