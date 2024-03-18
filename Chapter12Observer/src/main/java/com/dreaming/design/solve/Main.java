package com.dreaming.design.solve;

public class Main {
    public static void main(String[] args) {
        System.out.println("1、创建报纸");
        //创建一个报纸,作为被观察者
        NewsPaper subject =new NewsPaper ();

        System.out.println("2、创建订阅者");
        //创建阅读者,也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("张三");
        Reader reader2 =new Reader();
        reader2 .setName("李四");
        Reader reader3 =new Reader ();
        reader3.setName("王五");

        System.out.println("3、订阅报纸");
        //注册阅读者
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        System.out.println("4、报纸发布");
        //要出报纸啦
        subject .setContent("本期内容是观察者模式");
    }
}
