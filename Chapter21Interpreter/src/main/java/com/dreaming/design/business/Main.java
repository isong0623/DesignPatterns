package com.dreaming.design.business;

import java.io.File;

/**
 * 读取配置文件
 *
 * 考虑这样一个实际的应用:维护系统自定义的配置文件。
 *
 * 几乎每个实际的应用系统都有与应用自身相关的配置文件，
 * 这个配置文件是由开发人员根据需要自定义的，
 * 系统运行时会根据配置的数据进行相应的功能处理。
 *
 * 系统现有的配置数据很简单，
 * 主要是JDBC所需要的数据，还
 * 有默认读取Spring 的配置文件。
 * 目前系统只需要一个 Spring的配置文件。
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ReadAppXml reader = new ReadAppXml();
        reader.read(new File("Chapter21Interpreter\\src\\main\\resources\\DatabaseConfig1.xml").toURI().toString());
    }
}
