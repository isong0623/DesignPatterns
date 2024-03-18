package com.dreaming.design.business;

public class LogModel {
    //region 日志编号
    private String logId;
    public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }
    //endregion

    //region 操作人员
    private String operateUser;
    public String getOperateUser() {
        return operateUser;
    }
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }
    //endregion

    //region 操作时间
    private String operateTime;
    public String getOperateTime() {
        return operateTime;
    }
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }
    //endregion

    //region 日志内容
    private String logContent;
    public String getLogContent() {
        return logContent;
    }
    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
    //endregion
}
