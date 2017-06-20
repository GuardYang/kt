package com.ysr.bean;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Summer {
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
