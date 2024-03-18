package com.dreaming.design.business;

/**
 * 由于开始开发时业务的简捷，客户端知晓各个层的功能逻辑。
 */
public class Main {
    public static void main(String[]args){
        new Presentation().generate();
        new Business    ().generate();
        new DAO         ().generate();
    }
}
