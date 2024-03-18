package com.dreaming.design.solve.factory1.impl;

import com.dreaming.design.business.cpu.impl.AMDCPU;
import com.dreaming.design.business.cpu.wrapper.CPUApi;
import com.dreaming.design.business.mainboard.impl.MSIMainboard;
import com.dreaming.design.business.mainboard.wrapper.MainboardApi;
import com.dreaming.design.solve.factory1.wrapper.AbstractFactory;

/**
 * 装机方案二: AMD的CPU+微星的主板
 * 这里创建 CPU和主板对象的时候,是对应的,能匹配上的
 */
public class Schema2AbcFactory implements AbstractFactory {
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}