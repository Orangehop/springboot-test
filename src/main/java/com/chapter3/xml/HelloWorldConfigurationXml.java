package com.chapter3.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = { "classpath:spring/chapter2-app-context.xml" })
@Configuration
public class HelloWorldConfigurationXml {
}