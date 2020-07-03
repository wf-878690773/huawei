package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * 排序
 */
public class Main26 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!= null){
            int n = Integer.parseInt(str);
            String[] sort = br.readLine().split(" ");
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(sort[i]);
            }
            int flag = Integer.parseInt(br.readLine());
            sort(num,flag);
        }
    }
    public static void sort(int[] sort,int flag){
        Arrays.sort(sort);
        StringBuilder sb = new StringBuilder();
        if(flag == 0){
            for (int i = 0; i < sort.length; i++) {
                sb.append(sort[i]).append(" ");
            }
        }else{
            for(int i=sort.length-1;i>=0;i--){
                sb.append(sort[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
