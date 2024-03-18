package com.dreaming.design.solve.creator;

import com.dreaming.design.business.ExportFileApi;
import com.dreaming.design.solve.product.ExportDB;

/**
*   具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
*/
public class ExportDBOperate extends ExportOperate{
    //创建导出成数据库备份文件形式的对象
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }

}
