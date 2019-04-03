package com.example.helloworld.demo;

import com.example.message.MessageProvider;
import com.example.message.MessageRenderer;
import com.example.message.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {
    public static void main(String... args) {
        MessageRenderer mr =
              MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp =
              MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}