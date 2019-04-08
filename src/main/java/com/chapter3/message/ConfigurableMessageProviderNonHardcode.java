package com.chapter3.message;
import com.chapter2.helloworld.message.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProviderNonHardcode implements MessageProvider {
        private String message;
        @Autowired
        public ConfigurableMessageProviderNonHardcode(String message) {
                this.message = message;
        }
        @Override
        public String getMessage() {
                return this.message;
        }
}