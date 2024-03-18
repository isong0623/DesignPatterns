package com.dreaming.design.patterns02.business;

public class Impl implements Api {

    @Override
    public void test1(String s) {
        System.out.println("This is api impl, received param was:"+s);
    }

}