package com.dreaming.design.problem;

/**
 * 看了上面的实现，会感觉到很简单，通过使用简单工厂来获取需要的CPU和主板对象，然后就可以组装电脑了。有何问题呢?
 * 上面的实现，虽然通过简单工厂解决了:对于装机工程师，只知CPU和主板的接口，而不知道具体实现的问题。
 * 但还有一个问题没有解决，什么问题呢﹖那就是这些CPU对象和主板对象其实是有关系的，是需要相互匹配的。
 * 而在上面的实现中，并没有维护这种关联关系，CPU和主板是由客户随意选择的。这是有问题的。
 *
 * 比如在上面实现中的客户端，在调用makeComputer时，传入参数为(1,2)，试试看，运行结果就会如下:
 * now in Intel CPU, pins=1156
 * now in MSIMainboard, cpuHoles=939
 *
 * 观察上面的结果，就会看出问题。
 * 客户选择的CPU的针脚是1156针的，而选择的主板上的CPU插孔却只有939针，根本无法组装。
 * 这就是没有维护配件之间的关系造成的。
 * 该怎么解决这个问题呢?
 */
public class Main {
    public static void main(String[] args) {

    }
}
