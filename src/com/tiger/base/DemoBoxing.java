package com.tiger.base;

public class DemoBoxing {

    public static void main(String[] args) {

        System.out.println("Integer Boxing:");

        // Integer
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);

        System.out.println("Double Boxing:");

        //Double
        Double di1 = 100.0;
        Double di2 = 100.0;
        Double di3 = 200.0;
        Double di4 = 200.0;

        System.out.println(di1==di2);
        System.out.println(di3==di4);

        System.out.println("Boolean Boxing:");

        //Boolean
        Boolean bi1 = false;
        Boolean bi2 = false;
        Boolean bi3 = true;
        Boolean bi4 = true;

        System.out.println(bi1==bi2);
        System.out.println(bi3==bi4);
    }
}
