package com.dreaming.design.problem;

/**
 * 这样的实现有以下几个问题。
 * 既然想要实现通用的订单处理，那么对于订单处理的实现对象，是不应该知道订单的具体实现的，更不应该依赖订单的具体实现。但是上面的实现中，很明显订单处理的对象依赖了订单的具体实现对象。
 * 这种实现方式另外一个问题就是:难以扩展新的订单类型。假如现在要加入一个大客户专用订单的类型，那么就需要修改订单处理的对象，要在里面添加对新的订单类型的支持，这不能算做通用处理。
 * 因此，上面的实现是不太好的，把上面的问题再抽象描述一下:已经有了某个对象实例后，如何能够快速简单地创建出更多的这种对象?
 */
public class Main {
    public static void main(String[] args) {

    }
}
