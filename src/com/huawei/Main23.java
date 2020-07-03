package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 题目：成绩排序
 * 题目描述：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 * 都按先录入排列在前的规则处理。
 * 注：0代表从高到低，1代表从低到高
 * 输入描述:
 * 输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开
 *
 * 输出描述:
 * 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 * 示例1
 * 输入
 * 3
 * 0
 * fang 90
 * yang 50
 * ning 70
 * 输出
 * fang 90
 * ning 70
 * yang 50
 */
public class Main23 {
    /**
     * ?????
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            map.put(split[0],Integer.parseInt(split[1]));
        }
        Collection<Integer> values = map.values();
        //Collections.sort(values);

    }
}
