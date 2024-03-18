package com.dreaming.design.solve;

import com.dreaming.design.solve.interpreter.Context;
import com.dreaming.design.solve.interpreter.impl.ElementExpression;
import com.dreaming.design.solve.interpreter.impl.ElementTerminalExpression;
import com.dreaming.design.solve.self.ReadAppXml;

import java.io.File;

/**
 * 给定一个语言,定义它的文法的一种表示，并定义一个解释器，
 * 这个解释器使用该表示来解释语言中的句子。
 */
public class Main {
    private static void test() throws Exception {
        //准备上下文
        Context c = new Context(new File("Chapter21Interpreter\\src\\main\\resources\\InterpreterTest.xml").getAbsolutePath());
        //想要获取心元素的值,也就是如下表达式的值: "root/a/b/c"//首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression ("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression ("c");
        //组合起来
        root.addEle (aEle);
        aEle.addEle (bEle);
        bEle.addEle (cEle);
        //调用
        String ss[] = root.interpret (c);
        System.out.println("c的值是="+ss[0]);
    }

    public static void main(String[] args) throws Exception {
        ReadAppXml reader = new ReadAppXml();
        reader.read(new File("Chapter21Interpreter\\src\\main\\resources\\DatabaseConfig2.xml").getAbsolutePath());
    }
}
