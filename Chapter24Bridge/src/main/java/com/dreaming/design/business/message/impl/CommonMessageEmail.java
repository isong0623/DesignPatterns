package com.dreaming.design.business.message.impl;

import com.dreaming.design.business.message.wrapper.Message;

/**
以E-mail的方式发送普通消息
*/
public class CommonMessageEmail implements Message {
    public void send (String message,String toUser) {
        System.out.println("使用E-mail的方式,发送消息'"
                + message + "'给" + toUser);
    }
}
