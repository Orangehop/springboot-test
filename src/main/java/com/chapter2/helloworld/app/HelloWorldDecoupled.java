package com.chapter2.helloworld.app;

import com.chapter2.helloworld.message.MessageProvider;
import com.chapter2.helloworld.message.MessageRenderer;
import com.chapter2.helloworld.message.StandardOutMessageRenderer;
import com.chapter2.helloworld.message.HelloWorldMessageProvider;

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(null);
        mr.render();
    }
}