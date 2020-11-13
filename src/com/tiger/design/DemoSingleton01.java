package com.tiger.design;

public class DemoSingleton01 {

    private  static DemoSingleton01 mInstance = null;

    private DemoSingleton01(){
        //init

        System.out.println("com.tiger.design.DemoSingleton construct function!");
    }

    public static DemoSingleton01 getInstance(){

        System.out.println("com.tiger.design.DemoSingleton getInstance()");


        if(mInstance!=null){
            return  mInstance;
        }

        synchronized(DemoSingleton01.class){
            if(mInstance==null){
                mInstance = new DemoSingleton01();
            }
        }
        return  mInstance;
    }
}
