package com.chapter2.helloworld.message;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World pp!";
    }
}