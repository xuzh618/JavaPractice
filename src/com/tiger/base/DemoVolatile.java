package com.tiger.base;

/**
 * Volatile 作用：
 * 1. 保证多线程对变量的可见性
 * 2. 禁止指令重排操作（JMM）
 */
public class DemoVolatile {

    public int a = 0;

    public volatile boolean flag = false;

    // Thread A exe write
    public void write() {
        a = 1;
        flag = true;
    }

    // Thread B exe read
    public void read() {
        if (flag) {
            int i = a;
        }
    }
}
