package com.dreaming.design.solve.message.concrete.impl;

import com.dreaming.design.solve.message.concrete.wrapper.AbstractMessage;
import com.dreaming.design.solve.message.sender.wrapper.MessageImplementor;

public class CommonMessage extends AbstractMessage {
    public CommonMessage (MessageImplementor impl) {
        super(impl);
    }
    public void sendMessage (String message,String toUser) {
        //对于普通消息，什么都不干,直接调用父类的方法，把消息发送出去就可以了
        super.sendMessage(message, toUser);
    }
}
