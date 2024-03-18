package com.dreaming.design.solve.factory2.wrapper;

public interface AbstractFactory {
    public <T> T create(ProductType type);
}
