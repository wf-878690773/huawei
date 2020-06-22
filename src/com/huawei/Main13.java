package com.huawei;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，
 * 则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * */
public class Main13 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String word = null;
        while ((word = br.readLine() )!= null){
            Map<Character,Integer> map = new LinkedHashMap<>();
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i])){
                    map.put(chars[i],map.get(chars[i])+1);
                }else{
                    map.put(chars[i],1);
                }
            }
            Collection<Integer> values = map.values();
            Integer min = Collections.min(values);
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                if (map.get(c) != min){
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}