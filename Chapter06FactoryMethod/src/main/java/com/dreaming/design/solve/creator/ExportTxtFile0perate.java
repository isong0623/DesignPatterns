package com.dreaming.design.solve.creator;

import com.dreaming.design.business.ExportFileApi;
import com.dreaming.design.solve.product.ExportTxtFile;

/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 */
public class ExportTxtFile0perate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
