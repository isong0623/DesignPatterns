package com.dreaming.design.business;

/**
 * 示意配置管理管理器，负责配置的读取，并赋值到配置实体。
 */
public class ConfigManager {
    private static ConfigManager managerInstance;
    private static ConfigModel configInstance;
    private ConfigManager(){}

    public static ConfigManager getInstance(){
        if(managerInstance == null){
            synchronized (ConfigManager.class){
                if(managerInstance == null){
                    managerInstance = new ConfigManager();
                    configInstance = new ConfigModel();
                }
            }
        }
        return managerInstance;
    }

    public ConfigModel getConfig(){
        return configInstance;
    }
}
