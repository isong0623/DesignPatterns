package com.dreaming.design.business;

import java.util.List;

public class LogFileOperate implements LogFileOperateApi{

    private String logFilePathName = "AdapterLog.log";

    @Override
    public List<LogModel> readLogFile() {
        return null;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {

    }
}
