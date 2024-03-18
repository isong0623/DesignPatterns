package com.dreaming.design.problem;

import java.io.File;

/**
 * 随着开发的深入进行，越来越多可配置的数据被抽取出来，
 * 需要添加到配置文件中，比如与数据库的连接配置，
 * 就加入了是否需要、是否使用DataSource等配置。
 * 除了这些还加入了一些其他需要配置的数据，比如，系统管理员、日志记录方式、缓存线程的间隔时长、默认读取哪些Spring配置文件等。
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ReadAppXml reader = new ReadAppXml();
        reader.read(new File("Chapter21Interpreter\\src\\main\\resources\\DatabaseConfig2.xml").toURI().toString());
    }
}
