package com.dreaming.design.solve;

/**
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Main {
    public static void main(String[] args) {
        //准备登录人的信息
        LoginModel lm=new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd( "workerpwd");
        //准备用来进行判断的对象
        LoginTemplate lt =new WorkerLogin();
        LoginTemplate lt2 =new NormalLogin();
        //进行登录测试
        boolean flag= lt.login (lm);
        System.out.println("可以登录工作平台="+flag);
        boolean flag2= lt2.login (lm);
        System. out.println("可以进行普通人员登录="+flag2);
    }
}
