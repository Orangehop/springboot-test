package com.example.helloworld.demo;

import com.example.message.MessageProvider;
import com.example.message.MessageRenderer;
import com.example.message.StandardOutMessageRenderer;
import com.example.message.HelloWorldMessageProvider;

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(null);
        mr.render();
    }
}