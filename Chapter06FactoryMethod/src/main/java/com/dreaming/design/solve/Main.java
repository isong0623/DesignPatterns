package com.dreaming.design.solve;

import com.dreaming.design.business.ExportFileApi;

/**
 * 定义一个用于创建对象的接口,
 * 让子类决定实例化哪一个类，
 * Factory Method使一个类的实例化延迟到其子类。
 */
public class Main {
    public static void main(String[] args) {
        ExportFileApi api = ExportFileFactory.createFileCreator(ExportType.File);
        api.export("TEST");
    }
}
