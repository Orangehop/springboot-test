package com.chapter3.annotated;
import com.chapter2.helloworld.message.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponentsConstructorInjection {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/chapter3/constructor-external-app-context.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("provider",
            MessageProvider.class);
        System.out.println(messageProvider.getMessage());
        ctx.close();
    }
}