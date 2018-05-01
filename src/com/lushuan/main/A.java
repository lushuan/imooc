package com.lushuan.main;

import java.util.Date;

/**
 * 描述:
 * test
 *
 * @author lushuan
 * @create 2018-04-29 21:58
 */
public class A {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("argssdafsa = [" + new Date() + "]");

        }
    }
}



