package com.chapter3.configuration;

import com.chapter2.helloworld.message.HelloWorldMessageProvider;
import com.chapter2.helloworld.message.MessageProvider;
import com.chapter2.helloworld.message.MessageRenderer;
import com.chapter2.helloworld.message.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
        @Bean
        public MessageProvider provider() {
                return new HelloWorldMessageProvider();
        }

        @Bean
        public MessageRenderer renderer() {
                MessageRenderer renderer = new StandardOutMessageRenderer();
                renderer.setMessageProvider(provider());
                return renderer;
        }
}
