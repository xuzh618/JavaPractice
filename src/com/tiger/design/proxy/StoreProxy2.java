package com.tiger.design.proxy;

public class StoreProxy2 implements Apple {

    private Apple mFoxconn;

    public StoreProxy2(Apple foxconn) {
        this.mFoxconn = foxconn;
    }

    @Override
    public void iPhone() {
        System.out.println("StoreProxy2 start.");
        mFoxconn.iPhone();
        System.out.println("StoreProxy2 end.");
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
