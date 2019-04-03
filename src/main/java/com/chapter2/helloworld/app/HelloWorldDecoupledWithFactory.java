package com.chapter2.helloworld.app;

import com.chapter2.helloworld.message.MessageProvider;
import com.chapter2.helloworld.message.MessageRenderer;
import com.chapter2.helloworld.message.MessageSupportFactory;

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