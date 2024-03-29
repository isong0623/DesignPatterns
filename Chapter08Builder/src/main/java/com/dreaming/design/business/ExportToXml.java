package com.dreaming.design.business;

import java.util.Collection;
import java.util.Map;

/**
 * 导出数据到XML文件的对象
 */
public class ExportToXml {
    /**
     *导出数据到xML文件
     * @param ehm 文件头的内容
     * @param mapData 数据的内容
     * @param efm 文件尾的内容
     */
    public void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm){
        //用来记录最终输出的文件内容
        StringBuffer buffer =new StringBuffer();
        //1:先来拼接文件头的内容
        buffer.append("<?xml version='1.0'encoding= 'gb2312'?>\n");
        buffer.append ("<Report>\n");
        buffer.append("\t<Header>\n");
        buffer.append("\t\t<DepId>"+ehm.getDepId ()+"</DepId>\n");
        buffer.append("\t\t<ExportDate>"+ehm.getExportDate() +"</ExportDate>\n");
        buffer.append("\t</Header>\n");
        //2:再来拼接文件体的内容
        buffer.append("\t<Body> \n");
        for(String tblName : mapData.keySet ()){
            //先拼接表名称
            buffer.append("\t\t<Datas TableName=\""+tblName+"\">\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("\t\t\t<Data>\n");
                buffer.append("\t\t\t\t<ProductId>" + edm.getProductId() + "</ProductId>\n");
                buffer.append("\t\t\t\t<Price>" + edm.getPrice() + "</Price>\n");
                buffer.append("\t\t\t\t<Amount>" + edm.getAmount() + "</Amount>\n");
                buffer.append("\t\t\t</Data>\n");
            }
            buffer.append("\t\t</Datas>\n");
        }
        buffer.append("\t</Body>\n");
        //3:接着来拼接文件尾的内容
        buffer.append("\t<Footer>\n");
        buffer.append("\t\t<ExportUser>"+efm.getExportUser() +"</ExportUser>\n");
        buffer.append("\t</Footer>\n");
        buffer.append("</Report>\n");
        //为了演示的简洁性,这里就不再写输出文件的代码了
        //把要输出的内容输出到控制台看看
        System.out.println("输出到XML文件的内容:\n"+buffer);
    }
}