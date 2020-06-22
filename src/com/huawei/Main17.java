package com.huawei;

import java.util.Scanner;

/**
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、构成单词的字符只有26个大写或小写英文字母；
 * 2、非构成单词的字符均视为单词间隔符；
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * 4、每个单词最长20个字母；
 *
 * 输入描述:
 * 输入一行以空格来分隔的句子
 * 输出描述:
 * 输出句子的逆序
 *
 * 示例1
 * 输入：I am a student
 * 输出：student a am I
 */
public class Main17 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if((chars[i]<='z'&&chars[i]>='a') || (chars[i]<='Z'&&chars[i]>='A')){
                sb.append(chars[i]);
            }else{
                sb.append(" ");
            }
        }

        String[] str = sb.toString().trim().split(" ");

        StringBuilder sb2 = new StringBuilder();
        for(int i = str.length-1;i >=0;i--){
            sb2.append(str[i]).append(" ");
        }
        System.out.println(sb2.toString().trim());
    }

}
