package com.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 *
 * 输出描述:
 * 输出合并后的键值对（多行）
 */
public class Main8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num ; i++) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            addMap(map,s);
        }
        System.out.println(sortMap(map));
    }
    public static void addMap( TreeMap<Integer, Integer> map,String[] str){
        int key = Integer.parseInt(str[0]);
        int value = Integer.parseInt(str[1]);
        if (map.containsKey(key)){
            map.put(key,map.get(key)+value);
        }else {
            map.put(key,value);
        }
    }
    public static String sortMap(TreeMap<Integer, Integer> map){

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append( entry.getKey()).append(" ").append(entry.getValue()).append("\r");
        }
        return sb.toString();
    }
}