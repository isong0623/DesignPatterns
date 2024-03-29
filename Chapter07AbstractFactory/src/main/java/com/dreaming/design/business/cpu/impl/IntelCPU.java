package com.dreaming.design.business.cpu.impl;

import com.dreaming.design.business.cpu.wrapper.CPUApi;

/**
 * Intel的CPU实现
 */
public class IntelCPU implements CPUApi {
    /**
     * CPU的针脚数目
     */
    private int pins = 0;/*★
     *构造方法,传入CPU的针脚数目*@param pins CPU 的针脚数目*/

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("now in Intel CPU,pins=" + pins);
    }
}