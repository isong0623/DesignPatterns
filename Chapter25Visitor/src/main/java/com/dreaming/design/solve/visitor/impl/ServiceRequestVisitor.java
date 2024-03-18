package com.dreaming.design.solve.visitor.impl;

import com.dreaming.design.solve.customer.impl.EnterpriseCustomer;
import com.dreaming.design.solve.customer.impl.PersonalCustomer;
import com.dreaming.design.solve.visitor.wrapper.Visitor;

/**
 *具体的访问者,实现客户提出服务请求的功能
 */
public class ServiceRequestVisitor implements Visitor {
    public void visitEnterpriseCustomer (EnterpriseCustomer ec) {
        //企业客户提出的具体服务请求
        System.out.println(ec.getName() + "企业提出服务请求");
    }

    public void visitPersonalCustomer(PersonalCustomer pc){
        //个人客户提出的具体服务请求
        System.out.println("客户" + pc.getName() + "提出服务请求");
    }
}
