package com.dreaming.design.solve;

import com.dreaming.design.business.LogFileOperate;
import com.dreaming.design.problem.LogDbOperateAPi;

public class LogFileAdapter implements LogDbOperateAPi {

    private LogFileOperate adaptee;
    public LogFileAdapter(LogFileOperate adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void createLog() {

    }

    @Override
    public void deleteLog() {

    }

    @Override
    public void updateLog() {

    }

    @Override
    public void getAllLog() {

    }
}
