package com.chapter3.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimpleAnnotation {
    @Value("John Mayer")
    private String name;
    @Value("39")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("1241401113")
    private Long ageInSeconds;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/chapter3/values-annotation.xml");
        ctx.refresh();
        InjectSimpleAnnotation simple = (InjectSimpleAnnotation) ctx.getBean("injectSimple");
        System.out.println(simple);
        ctx.close();
    }

    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Age in Seconds: " + ageInSeconds + "\n" + "Height: "
                + height + "\n" + "Is Programmer?: " + programmer;
    }
}