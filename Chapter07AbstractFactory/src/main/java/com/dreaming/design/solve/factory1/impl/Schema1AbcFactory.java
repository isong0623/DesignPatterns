package com.dreaming.design.solve.factory1.impl;

import com.dreaming.design.business.cpu.impl.IntelCPU;
import com.dreaming.design.business.cpu.wrapper.CPUApi;
import com.dreaming.design.business.mainboard.impl.GAMainboard;
import com.dreaming.design.business.mainboard.wrapper.MainboardApi;
import com.dreaming.design.solve.factory1.wrapper.AbstractFactory;

/**
 * 装机方案一: Intel的CPU+技嘉的主板
 * 这里创建CPU和主板对象的时候,是对应的,能匹配上的
 */
public class Schema1AbcFactory implements AbstractFactory {
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}