package com.dreaming.design.business;

/**
 * 示意配置描述的数据Model
 */
public class ConfigModel {

    //region 是否需要生成表现层
    private boolean needGenPresentation = true;
    public boolean isNeedGenPresentation(){
        return needGenPresentation;
    }
    public void setNeedGenPresentation(boolean needGenPresentation){
        this.needGenPresentation = needGenPresentation;
    }
    //endregion

    //region 是否需要生成逻辑层
    private boolean needGenBusiness = true;
    public boolean isNeedGenBusiness(){
        return needGenBusiness;
    }
    public void setNeedGenBusiness(boolean needGenBusiness){
        this.needGenBusiness = needGenBusiness;
    }
    //endregion

    //region 是否需要生成DAO层
    private boolean needGenDAO = true;
    public boolean isNeedGenDAO(){
        return needGenDAO;
    }
    public void setNeedGenDAO(boolean eedGenDAO){
        this.needGenDAO = needGenDAO;
    }
    //endregion
}
