﻿package com.dreaming.design.business;

/**
 *处理订单的业务对象
 */
public class OrderBusiness {
    /**
     *创建订单的方法
     * @param order 订单的接口对象*/
    public void saveOrder (OrderApi order) {
        //1:判断当前的预定产品数量是否大于1000
        while (order.getOrderProductNum() > 1000) {
            //2:如果大于,还需要继续拆分
            //2.1再新建一份订单,跟传入的订单除了数量不一样外,其他都相同
            OrderApi newOrder = null;
            if (order instanceof PersonalOrder) {
                //创建相应的新的订单对象
                PersonalOrder p2 = new PersonalOrder();
                //然后进行赋值,但是产品数量为1000
                PersonalOrder p1 = (PersonalOrder) order;
                p2.setCustomerName(p1.getCustomerName());
                p2.setProductId(p1.getProductId());
                p2.setOrderProductNum(1000);
                //再设置给newOrder
                newOrder = p2;
            } else if (order instanceof EnterpriseOrder) {
                //创建相应的订单对象
                EnterpriseOrder e2 = new EnterpriseOrder();
                //然后进行赋值,但是产品数量为1000
                EnterpriseOrder e1 = (EnterpriseOrder) order;
                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setProductId(e1.getProductId());
                e2.setOrderProductNum(1000);
                //再设置给newOrder
                newOrder = e2;
            }

            //2.2原来的订单保留,把数量设置成减少1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            //然后是业务功能处理,省略了,打印输出,看一下
            System.out.println("拆分生成订单="+newOrder);
        }
        //3:不超过1000，那就直接业务功能处理，省略了，打印输出，看一下
        System.out.println("订单="+order);
    }
}

