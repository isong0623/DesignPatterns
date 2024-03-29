package com.dreaming.design.solve.message.concrete.impl;

import com.dreaming.design.solve.message.concrete.wrapper.AbstractMessage;
import com.dreaming.design.solve.message.sender.wrapper.MessageImplementor;

public class SpecialUrgencyMessage extends AbstractMessage {
    public SpecialUrgencyMessage (MessageImplementor impl) {
        super(impl);
    }
    public void hurry(String messageId) {
        //执行催促的业务,发出催促的信息
    }
    public void sendMessage (String message,String toUser){
        message = "特急:" + message;
        super.sendMessage(message, toUser);
        //还需要增加一条待催促的信息
    }
}
