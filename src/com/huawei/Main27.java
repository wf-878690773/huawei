package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 成绩排序（未完成）
 * 题目描述：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,
 * 相同成绩都按先录入排列在前的规则处理。
 * 注：0代表从高到低，1代表从低到高
 * 示例1
 * 输入
 *      3
 *      0
 *      fang 90
 *      yang 50
 *      ning 70
 * 输出
 *      fang 90
 *      ning 70
 *      yang 50
 */
public class Main27 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null){
            // 人数
            int count = Integer.parseInt(str);
            // 排序规则
            int sortType = Integer.parseInt(br.readLine());
            // 姓名和分数
            String[] names = new String[count];
            int[] scores = new int[count];


            for (int i = 0; i < count; i++) {
                // 录入成绩
                String[] s = br.readLine().split(" ");
                // 姓名
                String name = s[0];
                // 分数
                int score = Integer.parseInt(s[1]);

                // 从高到低
                if(sortType == 0){

                    for (int j = 0; j < count; j++) {

                    }


                    // 从低到高
                }else{


                }

            }


        }
    }
}
