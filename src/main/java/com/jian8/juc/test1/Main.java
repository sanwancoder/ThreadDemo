package com.jian8.juc.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = new String(sc.nextLine());
            String[] systemIn = s.split(" ");
            List<String>  res = new ArrayList<>();
            for(int i=1;i<systemIn.length;i++){
                String item = systemIn[i];
                if(item.length()%8!=0){
                    item = item+ "00000000";
                }
                while(item.length()>=8){
                    String sub = item.substring(0,8);
                    res.add(sub);
                    item  =item.substring(8);
                }
            }
            Collections.sort(res);
//            System.out.println(res);



            res.forEach(x->{
                System.out.print(x+" ");
            });
        }


    }


}
