package com.dreaming.design.business;

public class Business {
    public void generate(){
        ConfigModel config = ConfigManager.getInstance().getConfig();
        if(!config.isNeedGenBusiness()) return;
        System.out.println("正在生成业务层代码...");
    }
}
