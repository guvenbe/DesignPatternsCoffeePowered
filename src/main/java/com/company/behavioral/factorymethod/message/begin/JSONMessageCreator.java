package com.company.behavioral.factorymethod.message.begin;


import com.company.behavioral.factorymethod.message.JSONMessage;
import com.company.behavioral.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
