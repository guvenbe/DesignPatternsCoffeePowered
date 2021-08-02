package com.company.behavioral.factorymethod.message.begin;


import com.company.behavioral.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);;
    }
}
