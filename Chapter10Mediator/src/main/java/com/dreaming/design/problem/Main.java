package com.dreaming.design.problem;

/**
 * 如果上面的情况发生在软件开发上呢?
 * 若把每个电脑配件都抽象成为一个类或者是子系统，那就相当于出现了多个类之间相互交互，而且交互很繁琐，
 * 导致每个类都必须知道所有需要交互的类，也就是我们常说的类和类耦合了，是不是很麻烦?
 *
 * 在软件开发中出现这种情况可就不妙了，不但开发的时候每个类会复杂，因为要兼顾其他的类，
 * 更要命的是每个类在发生改动的时候，需要通知所有相关的类一起修改，
 * 因为接口或者是功能发生了变动，使用它的地方都得变，快要疯了吧!
 *
 * 那该如何来简化这种多个对象之间的交互呢?
 */
public class Main {
    public static void main(String[] args) {

    }
}
