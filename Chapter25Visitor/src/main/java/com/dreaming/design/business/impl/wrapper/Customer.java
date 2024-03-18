package com.dreaming.design.business.impl.wrapper;

public abstract class Customer {
    private String customerId;
    private String name;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void serviceRequest();
    /**
     *客户对公司产品的偏好分析,示意一下
     */
    public abstract void predilectionAnalyze();
    /**
     *客户价值分析,示意一下
     */
    public abstract void worthAnalyze();
}
