package com.jahop.api;

/**
 * Created by Pavel on 9/1/2016.
 */
public interface Client {
    Sender getSender(String topic);
}
