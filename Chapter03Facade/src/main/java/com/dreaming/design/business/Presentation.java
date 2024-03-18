package com.dreaming.design.business;

public class Presentation {
    public void generate(){
        ConfigModel config = ConfigManager.getInstance().getConfig();
        if(!config.isNeedGenPresentation()) return;
        System.out.println("正在生成表现层代码...");
    }
}
