package com.jahop.server;

import com.jahop.common.msg.Request;
import com.lmax.disruptor.EventFactory;

public class ServerEventFactory implements EventFactory<Request> {
    public Request newInstance() {
        return new Request();
    }
}