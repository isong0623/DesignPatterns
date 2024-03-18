package com.dreaming.design.solve.self;

import com.dreaming.design.solve.interpreter.Context;

/**
 *读取配置文件
 */
public class ReadAppXml {
    /**
     *读取配置文件内容
     *@param filePathName 配置文件的路径和文件名
     *@throws Exception
     */
    public void read (String filePathName) throws Exception {
        Context context = new Context(filePathName);
        ExpressionBuilder bDriverClass = new ExpressionBuilder(context)
                .build("root/database-connection/jdbc/driver-class")
                .printProduct();

        ExpressionBuilder bUrl = new ExpressionBuilder(context)
                .build("root/database-connection/jdbc/url")
                .printProduct();

        ExpressionBuilder bUser = new ExpressionBuilder(context)
                .build("root/database-connection/jdbc/user")
                .printProduct();

        ExpressionBuilder bPassword = new ExpressionBuilder(context)
                .build("root/database-connection/jdbc/password")
                .printProduct();

        ExpressionBuilder bApplicationXml = new ExpressionBuilder(context)
                .build("root/spring-default/application-xmls/application-xml")
                .printProduct();
    }
}
