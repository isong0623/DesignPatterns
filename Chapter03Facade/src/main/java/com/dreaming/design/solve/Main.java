package com.dreaming.design.solve;

public class Main {

    // 客户端不需要知晓各个层有什么功能，
    // 只需要关注Facade隔离出的功能，
    // 从而减少学习成本，增加代码复用率。
    public static void main(String[] args) {
        new Facade().generate();
    }

}
