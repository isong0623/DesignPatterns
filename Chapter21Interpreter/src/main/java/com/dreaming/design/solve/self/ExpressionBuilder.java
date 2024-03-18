package com.dreaming.design.solve.self;

import com.dreaming.design.solve.interpreter.Context;
import com.dreaming.design.solve.interpreter.impl.ElementExpression;
import com.dreaming.design.solve.interpreter.impl.ElementTerminalExpression;
import com.dreaming.design.solve.interpreter.wrapper.ReadXmlExpression;

public class ExpressionBuilder {
    private Context context;
    private ReadXmlExpression root;
    private ReadXmlExpression current;
    public ExpressionBuilder(Context c){
        this.context = c;
    }

    public ExpressionBuilder addElement(String name){
        if(root == null){
            root = new ElementExpression(name);
            current = root;
            return this;
        }
        ElementExpression e = new ElementExpression(name);
        ((ElementExpression)current).addEle(e);
        current = e;
        return this;
    }

    private String propertyName;
    public ExpressionBuilder addProperty(String name){
        propertyName = name;
        if(root == null){
//            throw new Exception("");
            return this;
        }
        ElementTerminalExpression e = new ElementTerminalExpression(name);
        ((ElementExpression)current).addEle(e);
        current = e;
        return this;
    }

    private String[] product;
    public ExpressionBuilder build(){
        product = root.interpret(context);
        return this;
    }

    public ExpressionBuilder build(String path){
        context.reInit();
        String[] ss = path.split("/");
        for(int i=0,ni=ss.length; i<ni; ++i){
            String node = ss[i];
            if(i==0){
                root = new ElementExpression(node);
                current = root;
                continue;
            }

            if(i==ni-1){
                ElementTerminalExpression e = new ElementTerminalExpression(node);
                ((ElementExpression)current).addEle(e);
                current = null;
                propertyName = node;
                continue;
            }

            ElementExpression e = new ElementExpression(node);
            ((ElementExpression)current).addEle(e);
            current = e;
        }
        product = root.interpret(context);
        return this;
    }

    public ExpressionBuilder printProduct(){
        if(product == null){
            System.out.println(propertyName+"==null");
            return this;
        }
        for(String s: product){
            System.out.println(propertyName+"=="+s);
        }
        return this;
    }

    public String[] getProduct(){
        return product;
    }
}
