package com.dreaming.design.solve.factory2.impl;

import com.dreaming.design.business.cpu.impl.IntelCPU;
import com.dreaming.design.business.mainboard.impl.MSIMainboard;
import com.dreaming.design.solve.factory2.wrapper.AbstractFactory;
import com.dreaming.design.solve.factory2.wrapper.ProductType;

public class Schema3AbcFactory implements AbstractFactory {
    @Override
    public <T> T create(ProductType type) {
        switch (type){
            case CPU       -> new IntelCPU(998);
            case Mainboard -> new MSIMainboard(998);
        }
        return null;
    }
}
