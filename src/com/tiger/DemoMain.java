package com.tiger;

import com.tiger.design.DemoSingleton01;

public class DemoMain {

    public static void main(String[] args) {

        DemoSingleton01.getInstance();

        int n = 9;
        int count = 0;

        while (n != 0) {

            n = n & (n - 1);

            System.out.println("n == " + n);

            count++;

            System.out.println("count == " + count);

        }
    }
}
