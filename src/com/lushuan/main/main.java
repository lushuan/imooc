package com.lushuan.main;

import java.util.Date;

/**
 * 描述:
 * test
 *
 * @author lushuan
 * @create 2018-04-29 21:58
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("args = [" + new Date() + "]");
            System.out.println("args = [" + args[0] + "]");
        }
        String fullUserName = getFullUserName("lushuan");
    }

    public static String getFullUserName(String firstName) {

        System.out.println(firstName);
        String lastName = "abc";
        logicMethod1(lastName);

        System.out.println(lastName);
        System.out.println(lastName);


        return "";
    }

    private static void logicMethod1(String lastName) {
        System.out.println(lastName);
        System.out.println(lastName);
    }
}