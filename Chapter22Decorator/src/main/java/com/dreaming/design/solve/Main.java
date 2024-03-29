package com.dreaming.design.solve;

import com.dreaming.design.solve.component.impl.ConcreteComponent;
import com.dreaming.design.solve.component.wrapper.Component;
import com.dreaming.design.solve.decorator.impl.GroupPrizeDecorator;
import com.dreaming.design.solve.decorator.impl.MonthPrizeDecorator;
import com.dreaming.design.solve.decorator.impl.SumPrizeDecorator;
import com.dreaming.design.solve.decorator.wrapper.Decorator;

/**
 * 动态地给一个对象添加一些额外的职责。
 * 就增加功能来说,装饰模式比生成子类更为灵活。
 */
public class Main {
    public static void main(String[] args) {
        //先创建计算基本奖金的类,这也是被装饰的对象
        Component c1 =new ConcreteComponent();
        //然后对计算的基本奖金进行装饰,这里要组合各个装饰
        //说明，各个装饰者之间最好是不要有先后顺序的限制
        //也就是先装饰谁和后装饰谁都应该是一样的
        //先组合普通业务人员的奖金计算
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);
        //注意:这里只需使用最后组合好的对象调用业务方法即可，会依次调用回去
        //日期对象都没有用上,所以传null就可以了
        double zs =d2.calcPrize("张三",null,null);
        System.out.println("==========张三应得奖金:"+zs);
        double ls =d2.calcPrize("李四",null, null);
        System.out.println( "==========李四应得奖金:"+ls);
        //如果是业务经理,还需要一个计算团队的奖金计算
        Decorator d3 = new GroupPrizeDecorator(d2);
        double ww = d3.calcPrize("王五",null, null);
        System.out.println("==========王经理应得奖金:"+ww);
    }
}
