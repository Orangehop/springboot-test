package com.chapter2.helloworld.message;

public interface MessageRenderer {
    // Render message
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}