package com.chapter3.annotated;

import com.chapter2.helloworld.message.MessageRenderer;
import com.chapter3.xml.HelloWorldConfigurationXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
        public static void main(String... args) {
                ApplicationContext ctx = new AnnotationConfigApplicationContext
                                (HelloWorldConfigurationXml.class);
                MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
                mr.render();
        }
}