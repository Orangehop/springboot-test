package com.chapter3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusionAnnotation {
    private String someValue;

    public ConstructorConfusionAnnotation(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    @Autowired
    public ConstructorConfusionAnnotation(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public String toString() {
        return someValue;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/chapter3/constructor-confusion.xml");
        ctx.refresh();
        ConstructorConfusionAnnotation cc = (ConstructorConfusionAnnotation) ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }
}
