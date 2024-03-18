package com.dreaming.design.solve;

import com.dreaming.design.solve.message.concrete.impl.CommonMessage;
import com.dreaming.design.solve.message.concrete.impl.SpecialUrgencyMessage;
import com.dreaming.design.solve.message.concrete.impl.UrgencyMessage;
import com.dreaming.design.solve.message.concrete.wrapper.AbstractMessage;
import com.dreaming.design.solve.message.sender.impl.MessageEmail;
import com.dreaming.design.solve.message.sender.impl.MessageMobile;
import com.dreaming.design.solve.message.sender.impl.MessageSMS;
import com.dreaming.design.solve.message.sender.wrapper.MessageImplementor;

/**
 * 将抽象部分与它的实现部分分离,使它们都可以独立地变化。
 */
public class Main {
    public static void main(String[] args) {
        //创建具体的实现对象
        MessageImplementor impl = new MessageSMS();
        //创建一个普通消息对象
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
        //创建一个紧急消息对象
        m=new UrgencyMessage(impl);
        m .sendMessage("请喝一杯茶","小李");
        //创建一个特急消息对象
        m=new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //把实现方式切换成手机短消息,然后再实现一遍
        impl =new MessageMobile();
        m=new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
        m=new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
        m= new SpecialUrgencyMessage (impl);
        m.sendMessage("请喝一杯茶","小李");

        //把实现方式切换成手E-mail短消息,然后再实现一遍
        impl =new MessageEmail();
        m=new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
        m=new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
        m= new SpecialUrgencyMessage (impl);
        m.sendMessage("请喝一杯茶","小李");
    }
}
