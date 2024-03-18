package com.dreaming.design.business;

import java.util.Collection;

/**
 * 考虑这样一个实际应用:要一次性访问多条数据。
 *
 * 这个功能的背景是这样的;在一个HR（人力资源）应用项目中客户提出，当选择一个部门或是分公司的时候，
 * 要把这个部门或者分公司下的所有员工都显示出来，而且不要翻页，方便他们进行业务处理。
 * 在显示全部员工的时候，只需要显示名称即可，但是也需要提供如下的功能:在必要的时候可以选择并查看某位员工的详细信息。
 *
 * 客户方是一个集团公司，有些部门或者分公司可能有好几百人，不让翻页，也就是要求一次性地获取这多条数据并展示出来。
 *
 * 该怎么样实现呢?
 */
public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Collection<UserModel> col = userManager.getUserByDepId("010101");
        System.out.println(col);
    }
}
