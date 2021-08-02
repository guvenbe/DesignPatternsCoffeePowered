package com.company.behavioral.factorymethod.message.begin;


import com.company.behavioral.factorymethod.message.Message;
import com.company.behavioral.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
