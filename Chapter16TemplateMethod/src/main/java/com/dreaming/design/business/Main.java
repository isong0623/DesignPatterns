package com.dreaming.design.business;

/**
 * 几乎所有的应用系统，都需要系统登录控制的功能，有些系统甚至有多个登录控制的功能，
 * 比如，普通用户可以登录前台，进行相应的业务操作;而工作人员可以登录后台，进行相应的系统管理或业务处理。
 * 现在有这么一个基于Web 的企业级应用系统，需要实现这两种登录控制，
 * 直接使用不同的登录页面来区分它们，把基本的功能需求分别描述如下。
 *
 * 先看看普通用户登录前台的登录控制的功能。
 *
 * 前台页面:用户能输入用户名和密码;提交登录请求，让系统进行登录控制。
 * 后台:从数据库获取登录人员的信息。
 * 后台:判断从前台传递过来的登录数据和数据库中已有的数据是否匹配。
 * 前台Action:如果匹配就转向首页，如果不匹配就返回到登录页面，并显示错误提示信息。
 *
 * 再来看看工作人员登录后台的登录控制功能。
 *
 * 前台页面:用户能输入用户名和密码;提交登录请求，让系统进行登录控制。
 * 后台:从数据库获取登录人员的信息。
 * 后台:把从前台传递过来的密码数据使用相应的加密算法进行加密运算，得到加密后的密码数据。
 * 后台:判断从前台传递过来的用户名和加密后的密码数据和数据库中已有的数据是否匹配。
 * 前台Action:如果匹配就转向首页，如果不匹配就返回到登录页面，并显示错误提示信息。
 */
public class Main {
    public static void main(String[] args) {

    }
}
