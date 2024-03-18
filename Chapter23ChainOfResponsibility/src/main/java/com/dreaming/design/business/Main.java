package com.dreaming.design.business;

/**
 * 申请聚餐费用
 *
 * 来考虑这样一个功能:申请聚餐费用的管理。
 *
 * 很多公司都有这样的福利，就是项目组或者是部门可以向公司申请一些聚餐费用,
 * 用于组织项目组成员或者是部门成员进行聚餐活动，以增进人员之间的情感，
 * 更有利于工作中的相互合作。
 *
 * 申请聚餐费用的大致流程一般是:由申请人先填写申请单，
 * 然后交给领导审查，如果申请批准下来了，领导会通知申请人审批通过，
 * 然后申请人去财务核领费用，如果没有核准,
 * 领导会通知申请人审批未通过,此事也就此作罢。
 *
 * 不同级别的领导，对于审批的额度是不一样的，
 * 比如，项目经理只能审批500元以内的申请;
 * 部门经理能审批1000元以内的申请;
 * 而总经理可以审核任意额度的申请。
 *
 * 也就是说，当某人提出聚餐费用申请的请求后，
 * 该请求会由项目经理、部门经理、总经理之中的某一位领导来进行相应的处理，
 * 但是提出申请的人并不知道最终会由谁来处理他的请求，
 * 一般申请人是把自己的申请提交给项目经理，或许最后是由总经理来处理他的请求，
 * 但是申请人并不知道应该由总经理来处理他的申请请求。
 *
 * 那么该怎样实现这样的功能呢?
 */
public class Main {
    public static void main(String[] args) {
        FeeRequest request =new FeeRequest();
        //开始测试
        String ret1 = request.requestToProjectManager("小李",300);
        System.out.println ( "the ret="+ret1);
        String ret2 = request.requestToProjectManager ("小张",300);
        System.out.println("the ret="+ret2);
        String ret3 = request.requestToProjectManager("小李",600);
        System.out.println("the ret="+ret3);
        String ret4 =request.requestToProjectManager("小张",600);
        System.out.println ("the ret="+ret4);
        String ret5 = request.requestToProjectManager("小李",1200);
        System.out.println("the ret="+ret5);
        String ret6 = request.requestToProjectManager ("小张",1200);
        System.out.println ( "the ret="+ret6);
    }
}
