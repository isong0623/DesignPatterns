﻿package com.dreaming.design.business;
/**
 ★描述登录人员登录时填写的信息的数据模型*/
public class WorkerLoginModel {

    private String workerId, pwd;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}