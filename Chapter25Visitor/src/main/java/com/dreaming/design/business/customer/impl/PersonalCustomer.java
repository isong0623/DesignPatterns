package com.dreaming.design.business.customer.impl;

import com.dreaming.design.business.customer.wrapper.Customer;

/**
 *个人客户
 */
public class PersonalCustomer extends Customer {
    /**
     *联系电话
     */
    private String telephone;

    /**
     *年龄
     */
    private int age;
    /**
     *企业注册地址
     */
    private String registerAddress;

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    /**
     *个人客户提出服务请求的方法,示意一下
     */
    public void serviceRequest() {
        //个人客户提出的具体服务请求
        System.out.println("客户" + this.getName() + "提出服务请求");
    }
}
