package com.dreaming.design.solve;

import com.dreaming.design.solve.cor.impl.DepManager;
import com.dreaming.design.solve.cor.impl.GeneralManager;
import com.dreaming.design.solve.cor.impl.ProjectManager;
import com.dreaming.design.solve.cor.wrapper.Handler;

/**
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 */
public class Main {
    public static void main(String[] args) {
        //先要组装职责链
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor (h2);
        h2.setSuccessor (h1);
        //开始测试
        String ret1 = h3.handleFeeRequest("小李",300);
        System.out.println( "the ret1="+ret1);
        String ret2 =h3.handleFeeRequest("小张",300);
        System. out.println( "the ret2="+ret2);
        String ret3 = h3.handleFeeRequest("小李",600);
        System.out.println("the ret3="+ret3);
        String ret4 = h3.handleFeeRequest("小张",600);
        System.out.println ("the ret4="+ret4);
        String ret5 = h3.handleFeeRequest("小李",1200);
        System.out.println("the ret5="+ret5);
        String ret6 = h3.handleFeeRequest("小张",1200);
        System.out.println("the ret6="+ret6);
    }
}
