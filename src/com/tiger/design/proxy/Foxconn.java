package com.tiger.design.proxy;


public class Foxconn implements Apple {
    @Override
    public void iPhone() {

        System.out.println("produce iPhone");

    }

    @Override
    public void iPad() {
        System.out.println("produce iPad");

    }

    @Override
    public void iWatch() {
        System.out.println("produce iWatch");
    }


}
