package com.dreaming.design.solve;

import java.util.Collection;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问。
 *
 * 本例为UserManager控制UserModel的字段
 * 在适当的时候自动加载以减少内存的使用。
 */
public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Collection<UserModelApi> col= userManager.getUserByDepId("010101");
        //如果只是显示用户名称,则不需要重新查询数据库
        for(UserModelApi umApi :col) {
            System.out.println(
                    "用户编号:=" + umApi.getUserId() +
                    ",用户姓名:=" + umApi.getName()
            );
        }

        //如果访问非用户编号和用户姓名外的属性,那就会重新查询数据库
        for (UserModelApi umApi:col){
            System.out.println(
                    "用户编号:=" + umApi.getUserId() +
                    "，用户姓名:=" + umApi.getName()+
                    ",所属部门:=" + umApi.getDepId());
        }
    }
}
