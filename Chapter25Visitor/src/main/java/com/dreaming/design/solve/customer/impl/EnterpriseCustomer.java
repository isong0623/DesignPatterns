package com.dreaming.design.solve.customer.impl;

import com.dreaming.design.solve.customer.wrapper.Customer;
import com.dreaming.design.solve.visitor.wrapper.Visitor;

public class EnterpriseCustomer extends Customer {
    private String linkman;
    private String linkTelephone;
    private String registerAddress;

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitEnterpriseCustomer(this);
    }
}
