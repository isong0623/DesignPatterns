package com.dreaming.design.business;

/**
 * 分析上面要实现的应用框架，
 * 不管用户选择什么样的导出格式，
 * 最后导出的都是一个文件，
 * 而且系统并不知道究竟要导出成为什么样的文件，
 * 因此应该有一个统一的接口来描述系统最后生成的对象，
 * 并操作输出的文件。
 *
 * 先把导出的文件对象的接口定义出来。示例代码如下:
 */
public interface ExportFileApi {
    /**
     * 导出内容成为文件
     *
     * @param data 示意:需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data) ;
}
