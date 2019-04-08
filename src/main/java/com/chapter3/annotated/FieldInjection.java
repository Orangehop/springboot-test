package com.chapter3.annotated;

import com.chapter3.sing.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
        public static void main(String... args) {
                GenericXmlApplicationContext ctx =
                      new GenericXmlApplicationContext();
                ctx.load("classpath:spring/chapter3/field.xml");
                ctx.refresh();
                Singer singerBean = ctx.getBean(Singer.class);
                singerBean.sing();
                ctx.close();
        }
}