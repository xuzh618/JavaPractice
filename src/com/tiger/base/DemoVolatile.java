package com.tiger.base;

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
