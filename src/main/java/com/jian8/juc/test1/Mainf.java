package com.jian8.juc.test1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (in.hasNext()) {
            int count = in.nextInt();
            int cc = count;
            String s[] = new String[count];
            int i = 0;
            while (count > 0) {
                s[i] = in.next();
                i++;
                count--;
            }
            for (int j = 0; j < cc; j++) {
                System.out.printf(s[j] + "\n");
// 对各个子串进行分割 加到list 中
                String str = s[j];
                int length = str.length();
                if(length<=8){
                    list.add(padding0(str));
                }else {
                    int q=0;
                    for(q=0;q<length/8;q++){
                        String ss = str.substring(q*8,(q+1)*8);
                        list.add(ss);
                    }
                    if(length%8==0){
                        String ss = str.substring((q+1)*8,length);
                        list.add(ss);
                    }
                }
            }
            return;
        }

//        System.out.println(padding0("12"));

//        System.out.println(padding0("12345678"));
    }



    private static String padding0(String str) {
        int len = str.length();
        int l = 8 - len;
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < l; i++) {
            buff.append("0");
        }
        return str + buff.toString();
    }
}