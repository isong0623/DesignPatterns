package com.dreaming.design.business;

/**
 * 考虑这样一个实际应用:订单处理系统。
 * 现在有一个订单处理的系统，里面有一个保存订单的业务功能。
 * 在这个业务功能中,客户有这样一个需求:
 * 每当订单的预定产品数量超过1000的时候，就需要把订单拆成两份订单来保存。
 * 如果拆成两份订单后，还是超过1000，那就继续拆分，直到每份订单的预定产品数量不超过1000。
 * 至于为什么要拆分，原因是方便进行订单的后续处理，后续是由人工来处理，每个人工工作小组的处理能力上限是1000。
 *
 * 根据业务，目前的订单类型被分成两种:
 * 一种是个人订单，一种是公司订单。
 * 现在想要实现一个通用的订单处理系统，也就是说，不管具体是什么类型的订单，都要能够正常地处理。
 *
 * 该怎么实现呢?
 *
 */
public class Main {
    public static void main(String[] args) {
        //创建订单对象,这里为了演示简单,直接new了
        PersonalOrder op = new PersonalOrder();
        //设置订单数据
        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        op.setProductId("PO001");
        //这里获取业务处理的类,也直接new了，为了简单，连业务接口都没有做
        OrderBusiness ob = new OrderBusiness();
        //调用业务来保存订单对象
        ob.saveOrder (op);
    }
}
