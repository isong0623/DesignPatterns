package com.dreaming.design.solve.builder.impl;

import com.dreaming.design.business.ExportDataModel;
import com.dreaming.design.business.ExportFooterModel;
import com.dreaming.design.business.ExportHeaderModel;
import com.dreaming.design.solve.builder.wrapper.Builder;

import java.util.Collection;
import java.util.Map;

/**
 *实现导出数据到XML文件的生成器对象
 */
public class XmlBuilder implements Builder {
    /**
     * 用来记录构建的文件的内容,相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append("\t<Body>\n");
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append("\t\t<Datas TableName-\"" + tblName + "\">\n");
            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("\t\t\t<Data>\n");
                buffer.append("\t\t\t\t<ProductId>" + edm.getProductId() + "</ProductId>\n");
                buffer.append("\t\t\t\t<Price>" + edm.getPrice() + "</Price>\n");
                buffer.append("\t\t\t\t<Amount>" + edm.getAmount() + "</Amount>\n");
                buffer.append("\t\t\t</Data>\n");
            }
            buffer.append("\t\t</Datas>\n");
        }
        buffer.append("\t</Body>\n");
    }

    public void buildFooter(ExportFooterModel efm) {
        buffer.append("\t<Footer>\n");
        buffer.append("\t\t<ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("\t</Footer>\n");
        buffer.append("</Report>\n");
    }

    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0'encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("\t<Header>\n");
        buffer.append("\t\t<DepId>" + ehm.getDepId() + "</DepId>\n");
        buffer.append("\t\t<ExportDate>" + ehm.getExportDate()+"</ExportDate>\n");
        buffer.append("\t</Header>\n");
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
