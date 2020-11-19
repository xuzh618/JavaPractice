package com.tiger.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {

        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Dynamic proxy start.");
        // 可以统一在这里实现全局操作
        Object result = method.invoke(obj, args);

        System.out.println("Dynamic proxy end.");

        return null;
    }
}
