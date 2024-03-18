package com.dreaming.design.solve;

import com.dreaming.design.solve.customer.impl.EnterpriseCustomer;
import com.dreaming.design.solve.customer.impl.PersonalCustomer;
import com.dreaming.design.solve.customer.wrapper.Customer;
import com.dreaming.design.solve.visitor.impl.PredilectionAnalyzeVisitor;
import com.dreaming.design.solve.visitor.impl.ServiceRequestVisitor;

public class Main {
    public static void main(String[] args) {
        //创建 ObjectStructure
        ObjectStructure os = new ObjectStructure();
        //准备些测试数据,创建客户对象,并加入ObjectStructure
        Customer cm1 =new EnterpriseCustomer();
        cm1.setName ( "ABC集团");
        os.addElement (cm1);
        Customer cm2 = new EnterpriseCustomer();
        cm2.setName ("CDE公司");
        os .addElement (cm2);
        Customer cm3 =new PersonalCustomer();
        cm3 .setName("张三");
        os.addElement (cm3);

        //客户提出服务请求,传入服务请求的Visitor
        ServiceRequestVisitor srVisitor =new ServiceRequestVisitor();
        os.handleRequest(srVisitor);
        //要对客户进行偏好分析,传入偏好分析的Visitor
        PredilectionAnalyzeVisitor paVisitor =new PredilectionAnalyzeVisitor();
        os.handleRequest(paVisitor);

    }
}
