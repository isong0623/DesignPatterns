package com.dreaming.design.business;

public class DAO {
    public void generate(){
        ConfigModel config = ConfigManager.getInstance().getConfig();
        if(!config.isNeedGenDAO()) return;
        System.out.println("正在生成数据层代码...");
    }
}
