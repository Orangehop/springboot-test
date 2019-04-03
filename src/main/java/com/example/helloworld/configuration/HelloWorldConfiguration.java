package com.example.helloworld.configuration;

import com.example.message.HelloWorldMessageProvider;
import com.example.message.MessageProvider;
import com.example.message.MessageRenderer;
import com.example.message.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
        // equivalent to <bean id="provider" class=".."/>
        @Bean
        public MessageProvider provider() {
                return new HelloWorldMessageProvider();
        }
        // equivalent to  <bean id="renderer" class=".."/>
        @Bean
        public MessageRenderer renderer(){
                MessageRenderer renderer = new StandardOutMessageRenderer();
                renderer.setMessageProvider(provider());
                return renderer;
        }
}