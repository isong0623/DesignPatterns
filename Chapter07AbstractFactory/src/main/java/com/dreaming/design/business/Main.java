package com.dreaming.design.business;

/**
 * 选择组装电脑的配件
 */
public class Main {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //告诉装机工程师自己选择的配件,让装机工程师组装电脑
        engineer. makeComputer(1,1);
    }
}