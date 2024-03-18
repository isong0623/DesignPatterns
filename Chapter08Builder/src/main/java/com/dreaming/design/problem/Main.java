package com.dreaming.design.problem;

/**
 * 仔细观察上面的实现，会发现，不管是输出成文本文件，还是输出到XML文件，在实现的时候,步骤基本上都是一样的，大致分成了以下四步。
 * (1）先拼接文件头的内容。
 * (2）然后拼接文件体的内容。
 * (3）再拼接文件尾的内容。
 * (4）最后把拼接好的内容输出去成为文件。
 *
 * 也就是说，对于不同的输出格式，处理步骤是一样的，但是每步的具体实现是不一样的。按照现在的实现方式，就存在如下的问题。
 * (1）构建每种输出格式的文件内容的时候，都会重复这几个处理步骤，应该提炼出来，形成公共的处理过程。
 * (2）今后可能会有很多不同输出格式的要求，这就需要在处理过程不变的情况下，能方便地切换不同的输出格式的处理。
 *
 * 换句话来说，也就是构建每种格式的数据文件的处理过程，应该和具体的步骤实现分开，这样就能够复用处理过程，而且能很容易地切换不同地输出格式。
 *
 * 可是该如何实现呢?
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("ce是");
    }
}