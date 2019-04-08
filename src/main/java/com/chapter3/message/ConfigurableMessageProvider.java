package com.chapter3.message;

import com.chapter2.helloworld.message.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}


// @Service("provider")
// public class ConfigurableMessageProvider implements MessageProvider {
//         private String message;
//         @Autowired
//         public ConfigurableMessageProvider(
//         (@Value("Configurable message") String message) {
//                 this.message = message;
//         }
//         @Override
//         public String getMessage() {
//                 return this.message;
//         }
// }