package com.dreaming.design.problem;

/**
 * 对于实现导出数据的业务功能对象，
 * 它应该根据需要来创建相应的ExportFileApi的实现对象，
 * 因为特定的ExportFileApi的实现是与具体的业务相关的。
 * 但是对于实现导出数据的业务功能对象而言，
 * 它并不知道应该创建哪一个 ExportFileApi 的实现对象，
 * 也不知道如何创建。
 *
 * 也就是说:对于实现导出数据的业务功能对象，
 * 它需要创建ExportFileApi的具体实例对象，
 * 但是它只知道ExportFileApi接口，
 * 而不知道其具体的实现，那该怎么办呢?
 */
public class Main {
    public static void main(String[] args) {

    }
}
