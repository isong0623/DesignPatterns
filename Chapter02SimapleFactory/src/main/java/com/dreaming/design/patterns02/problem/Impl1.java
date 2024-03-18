package com.dreaming.design.patterns02.problem;

public class Impl1 implements Api{
    @Override
    public void test1(String s) {
        System.out.println("This is api impl1, received param was:"+s);
    }
}
