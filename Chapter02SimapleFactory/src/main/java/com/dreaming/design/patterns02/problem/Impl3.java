package com.dreaming.design.patterns02.problem;

public class Impl3 implements Api{
    @Override
    public void test1(String s) {
        System.out.println("This is api impl3, received param was:"+s);
    }
}