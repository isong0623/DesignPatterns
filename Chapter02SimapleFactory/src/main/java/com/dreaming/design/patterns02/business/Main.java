package com.dreaming.design.patterns02.business;

public class Main {
    public static void main(String[]args){
        //主动创建需要的对象去调用
        Api api = new Impl();
        api.test1("");
    }
}
