package com.dreaming.design.solve.creator;

import com.dreaming.design.business.ExportFileApi;

/**
 * 实现导出数据的业务功能对象
 */

public abstract class ExportOperate implements ExportFileApi{
    public boolean export (String data){
        //使用工厂方法
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     *
     * @return 导出的文件对象的接口对象
     */
    protected abstract ExportFileApi factoryMethod();
}