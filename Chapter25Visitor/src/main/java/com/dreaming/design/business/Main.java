package com.dreaming.design.business;

import com.dreaming.design.business.impl.impl.EnterpriseCustomer;
import com.dreaming.design.business.impl.impl.PersonalCustomer;
import com.dreaming.design.business.impl.wrapper.Customer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 扩展客户管理的功能
 *
 * 考虑这样一个应用:扩展客户管理的功能。
 *
 * 既然是扩展功能，那么肯定是已经存在一定的功能了，先看看已有的功能，
 * 公司的客户分成两大类，一类是企业客户，一类是个人客户，
 * 现有的功能非常简单，就是能让客户提出服务申请。
 *
 * 现有实现 /customer
 */
public class Main {
    public static void main (String[] args) {
        //准备些测试数据
        Collection<Customer> colCustomer = preparedTestData();
        //循环对客户进行操作
        for(Customer cm :colCustomer) {
            //进行偏好分析
            cm.predilectionAnalyze();
            //进行价值分析
            cm.worthAnalyze();
        }
    }

    private static Collection<Customer> preparedTestData(){
        Collection<Customer>colCustomer= new ArrayList<Customer>();
        //为了测试方便,准备些数据
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName ( "ABC集团");
        colCustomer.add(cm1);

        Customer cm2 =new EnterpriseCustomer();
        cm2.setName("CDE公司");
        colCustomer.add(cm2);

        Customer cm3 =new PersonalCustomer();
        cm3 .setName("张三");
        colCustomer.add (cm3);

        return colCustomer;

    }
}
