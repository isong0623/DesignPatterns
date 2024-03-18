package com.dreaming.design.solve.customer.impl;

import com.dreaming.design.solve.customer.wrapper.Customer;
import com.dreaming.design.solve.visitor.wrapper.Visitor;

public class PersonalCustomer extends Customer {
    private String telephone;
    private int age;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitPersonalCustomer(this);
    }
}
