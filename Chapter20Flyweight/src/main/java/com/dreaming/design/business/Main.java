package com.dreaming.design.business;

/**
 * 考虑这样一个问题，给系统加入权限控制，这基本上是所有的应用系统都有的功能。
 * 对于应用系统而言，一般先要登录系统，才可以使用系统的功能。
 * 登录后，用户的每次操作都需要经过权限系统的控制，确保该用户有操作该功能的权限，
 * 同时还要控制该用户对数据的访问权限、修改权限等。
 * 总之一句话，一个安全的系统，需要对用户的每一次操作都要做权限检测，
 * 包括功能和数据，以确保只有获得相应授权的人，才能执行相应的功能，操作相应的数据。
 */
public class Main {
    public static void main(String[] args) {
        //需要先登录,然后再判断是否有权限
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        boolean f1 = mgr.hasPermit("张三","薪资数据","查看");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");
        System.out.println("f1=="+f1);
        System.out.println("f2=="+f2);
        for(int i=0;i<3;++i) {
            mgr.login("张三" + i);
            mgr.hasPermit("张三" + i, "薪资数据", "查看");
        }
    }
}
