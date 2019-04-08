package com.chapter3.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "com.chapter3.annotation" })
@Configuration
public class HelloWorldConfigurationComponentScanning {
}