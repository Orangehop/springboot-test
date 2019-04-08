package com.chapter3.message;
import com.chapter2.helloworld.message.MessageProvider;
import org.springframework.stereotype.Component;

//simple bean
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
        @Override
        public String getMessage() {
                return "Hello World!";
        }
}
