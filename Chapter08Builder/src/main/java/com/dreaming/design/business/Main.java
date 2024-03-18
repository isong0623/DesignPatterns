package com.dreaming.design.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 对于导出数据的应用框架，通常对于具体的导出内容和格式是有要求的，假如现在有如下的要求,简单描述一下:
 * 导出的文件，不管什么格式，都分成3个部分，分别是文件头、文件体和文件尾。
 *
 * 在文件头部分，需要描述如下信息:分公司或门市点编号、导出数据的日期，对于文本格式，中间用逗号分隔。
 * 在文件体部分，需要描述如下信息:表名称，然后分条描述数据。对于文本格式,表名称单独占一行，数据描述一行算一条数据，字段间用逗号分隔。
 * 在文件尾部分，需要描述如下信息:输出人。
 *
 * 现在就要来实现上述功能。为了演示简单点，在工厂方法模式里面已经实现的功能,就再不重复了，
 * 这里只关心如何实现导出文件，而且只实现导出成文本格式和Xml格式就可以了，其他就不用考虑了。
 */
public class Main {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm. setDepId("一分公司");
        ehm.setExportDate( "2010-05-18");
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel>col = new ArrayList<ExportDataModel>();
        ExportDataModel edml = new ExportDataModel();
        edml .setProductId("产品001号");
        edml .setPrice (100);
        edml .setAmount(80);
        ExportDataModel edm2 = new ExportDataModel();
        edm2 .setProductId("产品002号");
        edm2 .setPrice(99);
        edm2.setAmount (55);
        //把数据组装起来
        col.add (edml);
        col.add(edm2);
        mapData.put("销售记录表",col);
        ExportFooterModel efm = new ExportFooterModel();
        efm. setExportUser("张三");
        //测试输出到文本文件
        ExportToTxt toTxt = new ExportToTxt();
        toTxt.export (ehm, mapData, efm);
        //测试输出到xml文件
        ExportToXml toXml =new ExportToXml();
        toXml.export (ehm, mapData, efm);
    }
}
