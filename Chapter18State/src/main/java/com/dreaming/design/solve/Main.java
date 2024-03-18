package com.dreaming.design.solve;

/**
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 */
public class Main {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++) {
            vm.vote("u1", "A");
        }
    }
}
