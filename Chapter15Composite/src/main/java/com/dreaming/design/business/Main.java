package com.dreaming.design.business;

/**
 * 考虑这样一个实际的应用:管理商品类别树。
 * 在实现跟商品有关的应用系统的时候，一个很常见的功能就是商品类别树的管理，比如有以下的商品类别树:
 * +服装
 *  +男装
 *      -衬衣
 *      -夹克
 *  +女装
 *      -裙子
 *      -套装
 * 仔细观察上面的商品类别树，有以下几个明显的特点。
 * 有一个根节点，比如服装，它没有父节点，它可以包含其他的节点。
 * 树枝节点，有一类节点可以包含其他的节点，称之为树枝节点，比如男装、女装。叶子节点，有一类节点没有子节点，称之为叶子节点，比如衬衣、夹克、裙子、套装。
 * 现在需要管理商品类别树，假如要求能实现输出如上商品类别树的结构功能，应该如何实现呢?
 */
public class Main {
    public static void main(String[] args) {
//定义所有的组合对象
        Composite root =new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c2 =new Composite("女装");
        //定义所有的叶子对象
        Leaf leaf1 =new Leaf("衬衣");
        Leaf leaf2 =new Leaf("夹克");
        Leaf leaf3 =new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");
        //按照树的结构来组合组合对象和叶子对象
        root.addComposite(c1);
        root.addComposite(c2);
        c1.addLeaf (leaf1);
        c1.addLeaf (leaf2);
        c2.addLeaf(leaf3);
        c2.addLeaf (leaf4);
        //调用根对象的输出功能来输出整棵树
        root.printStruct ("");
    }
}
