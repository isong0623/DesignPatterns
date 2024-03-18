package com.dreaming.design.problem;

/**
 * 用户使用日志管理第一版一段时间后，开始考
 * 虑升级系统，决定要采用数据库来管理日志。很
 * 快，按照数据库的日志管理也实现出来了，并定义
 * 了日志管理的操作接口，主要是针对日志的增删改
 * 查方法。
 */
public interface LogDbOperateAPi {
    public void createLog();
    public void deleteLog();
    public void updateLog();
    public void getAllLog();
}
