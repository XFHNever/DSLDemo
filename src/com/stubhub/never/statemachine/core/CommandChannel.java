package com.stubhub.never.statemachine.core;

/**
 * Created by fuxie on 2014/7/18  13:46.
 */
public class CommandChannel {
    public void send(String commandCode) {
        System.out.println("send CommandCode: " + commandCode);
    }
}
