package com.dreaming.design.solve;

import com.dreaming.design.business.Business;
import com.dreaming.design.business.DAO;
import com.dreaming.design.business.Presentation;

//外观模式的本质：封装交互，简化调用。
public class Facade {
    //外观模式隔离系统功能逻辑
    public void generate(){
        new Presentation().generate();
        new Business    ().generate();
        new DAO         ().generate();
    }
}
