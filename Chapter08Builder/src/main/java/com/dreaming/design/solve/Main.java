package com.dreaming.design.solve;

import com.dreaming.design.business.ExportDataModel;
import com.dreaming.design.business.ExportFooterModel;
import com.dreaming.design.business.ExportHeaderModel;
import com.dreaming.design.solve.builder.Director;
import com.dreaming.design.solve.builder.impl.TxtBuilder;
import com.dreaming.design.solve.builder.impl.XmlBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 生成器模式的主要功能是构建复杂的产品，而且是细化的、分步骤的构建产品，也就是生成器模式重在一步一步解决构造复杂对象的问题。
 * 生成器模式的重心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用。
 * 具体的构造实现可以很方便地扩展和切换，从而可以灵活地组合来构造出不同的产品对象。
 */
public class Main {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();ehm. setDepId("一分公司");
        ehm.setExportDate( "2010-05-18");
        Map<String, Collection<ExportDataModel>> mapData= new HashMap();
        Collection<ExportDataModel> col = new ArrayList();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);
        ExportDataModel edm2 =new ExportDataModel() ;
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表",col);
        ExportFooterModel efm = new ExportFooterModel ();
        efm.setExportUser("张三");


        //测试输出到文本文件
        TxtBuilder txtBuilder = new TxtBuilder ();
        //创建指导者对象
        Director director = new Director(txtBuilder);
        director.construct (ehm, mapData, efm);
        //把要输出的内容输出到控制台看看
        System.out.println("输出到文本文件的内容:\n" +txtBuilder.getResult());
        //测试输出到XML文件
        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director2 = new Director (xmlBuilder);
        director2.construct (ehm, mapData, efm);
        //把要输出的内容输出到控制台看看
        System.out.println("输出到XML文件的内容:\n" +xmlBuilder.getResult());
    }
}
