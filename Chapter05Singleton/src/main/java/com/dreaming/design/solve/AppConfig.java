package com.dreaming.design.solve;

public class AppConfig {
    //饿汉模式，按需生成单例
    private static AppConfig instanceHungry;
    public static AppConfig getInstanceHungry(){
        if(instanceHungry == null){
            synchronized (AppConfig.class){
                if(instanceHungry == null){
                    instanceHungry = new AppConfig();
                }
            }
        }

        return instanceHungry;
    }

    //饱汉模式，在类初始化时同时创建一个单例对象
    private static AppConfig instanceFull = new AppConfig();
    public static AppConfig getInstanceFull(){
        return instanceFull;
    }


    public void readConfig(){
        //同上，复杂耗时的实现
    }
}
