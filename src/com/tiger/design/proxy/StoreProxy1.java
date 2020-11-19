package com.tiger.design.proxy;

public class StoreProxy1 implements Apple {

    private Apple mFoxconn;

    public StoreProxy1(Apple foxconn) {
        this.mFoxconn = foxconn;
    }

    @Override
    public void iPhone() {
        System.out.println("StoreProxy1 start.");
        mFoxconn.iPhone();
        System.out.println("StoreProxy1 end.");

    }

    @Override
    public void iPad() {
        mFoxconn.iPad();
    }

    @Override
    public void iWatch() {
        mFoxconn.iWatch();
    }
}
