package com.chapter2.helloworld.app;

import com.chapter2.helloworld.message.MessageRenderer;
import com.chapter2.helloworld.configuration.HelloWorldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
        public static void main(String... args) {
                ApplicationContext ctx = new AnnotationConfigApplicationContext
                                (HelloWorldConfiguration.class);
                MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
                mr.render();
        }
}