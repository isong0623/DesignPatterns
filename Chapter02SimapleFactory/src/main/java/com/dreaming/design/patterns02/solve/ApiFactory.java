package com.dreaming.design.patterns02.solve;

import com.dreaming.design.patterns02.solve.impl.Impl1;
import com.dreaming.design.patterns02.solve.impl.Impl2;
import com.dreaming.design.patterns02.solve.impl.Impl3;
import com.dreaming.design.patterns02.solve.wrapper.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//简单工厂模式的本质：选择实现
public class ApiFactory {
    /**
     * 由具体配置创建实现对象，增加了客户端对实现类型的学习成本。
     */
    public static Api createApi(ImplType type) throws NullPointerException {
        if(type != null){
            switch (type){
                case IMPL_1:
                    return new Impl1();
                case IMPL_2:
                    return new Impl2();
                case IMPL_3:
                    return new Impl3();
            }
        }
        throw new NullPointerException();
    }

    /**
     * 由配置提供静态或动态实现对象
     */
    public static Api createApi(){
        //#1 由配置文件创建具体实现
        Properties p;
        InputStream in = null;
        try {
            p = new Properties();
            in = ApiFactory.class.getResourceAsStream("FactoryTest.properties");

            p.load(in);
            return (Api)Class.forName(p.getProperty("ImplClass","Impl1")).getDeclaredConstructor().newInstance();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //#2 提供默认实现
        return new Impl2();

        //#3 提供网络请求的动态实现
    }
}
