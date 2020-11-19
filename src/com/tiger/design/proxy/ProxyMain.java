package com.tiger.design.proxy;

import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main(String[] args) {

        //static proxy
        StoreProxy1 sp1 = new StoreProxy1(new Foxconn());
        sp1.iPhone();
        sp1.iPad();
        sp1.iWatch();

        StoreProxy2 sp2 = new StoreProxy2(new Foxconn());
        sp2.iPhone();
        sp2.iPad();
        sp2.iWatch();

        //dynamic proxy

        DynamicProxy dynamicProxy = new DynamicProxy(new Foxconn());

        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Apple apple = (Apple) Proxy.newProxyInstance(
                Apple.class.getClassLoader(),
                new Class[]{Apple.class},
                dynamicProxy);

        apple.iPhone();
        apple.iPad();
        apple.iWatch();
    }
}
