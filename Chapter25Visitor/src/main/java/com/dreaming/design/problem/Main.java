package com.dreaming.design.problem;

/**
 * 以很简单的方式，实现了要求的功能，这种实现有没有什么问题呢?
 * 仔细分析上面的实现，发现有以下两个主要的问题。
 *
 * 在企业客户和个人客户的类中，都分别实现了提出服务请求、
 * 进行产品偏好分析、进行客户价值分析等功能，也就是说，
 * 这些功能的实现代码是混杂在同一个类中的;
 * 而且相同的功能分散到了不同的类中去实现，
 * 会导致整个系统难以理解、难以维护。
 *
 * 更为痛苦的是，采用这样的实现方式，如果要给客户扩展新的功能，
 * 比如前面提到的针对不同的客户进行需求调查、
 * 针对不同的客户进行满意度分析、客户消费预期分析等。
 * 每次扩展，都需要改动企业客户的类和个人客户的类，
 * 当然也可以通过为它们扩展子类的方式，
 * 但是这样可能会造成过多的对象层次。
 *
 * 那么有没有办法，能够在不改变客户对象结构中各元素类的前提下，
 * 为这些类定义新的功能?也就是要求不改变企业客户和个人客户类，
 * 就能为企业客户和个人客户类定义新的功能?
 */
public class Main {
    public static void main(String[] args) {

    }
}
