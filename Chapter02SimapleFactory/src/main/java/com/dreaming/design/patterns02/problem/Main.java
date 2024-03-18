package com.dreaming.design.patterns02.problem;

public class Main {
    public static void main(String[]args){
        //通过抽象出具体业务的公共功能来屏蔽具体实现
        //客户端不需要完全知道具体实现
        Api api;

        //根据业务需要选择具体的实现
        //随着业务的增加实现也开始增加
        api = new Impl1();
        api.test1("");

        api = new Impl2();
        api.test1("");

        api = new Impl3();
        api.test1("");
    }
}
