package com.ysr;

/**
 * Created by Administrator on 2017/5/19.
 */
public class Register {
    public static void main(String... args) {
//        int a = 20;
//        System.out.print(a);
        String s = "a,b,c,,";
        String[] t = s.split(",");
        System.out.print(t.length);
    }
}
