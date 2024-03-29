package com.dreaming.design.solve.factory1.wrapper;

import com.dreaming.design.business.cpu.wrapper.CPUApi;
import com.dreaming.design.business.mainboard.wrapper.MainboardApi;

/**
 *抽象工厂的接口,声明创建抽象产品对象的操作
 */
public interface AbstractFactory {
    /**
     * 创建CPU的对象
     *
     * @return CPU的对象
     */
    public CPUApi createCPUApi();

    /**
     * 创建主板的对象
     *
     * @return 主板的对象
     */
    public MainboardApi createMainboardApi();
}
