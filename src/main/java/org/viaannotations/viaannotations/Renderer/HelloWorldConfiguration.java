package org.viaannotations.viaannotations.Renderer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.viaannotations.viaannotations.Provider.HelloWorldMessageProvider;
import org.viaannotations.viaannotations.Provider.MessageProvider;


@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider() {
        return (MessageProvider) new HelloWorldMessageProvider();
    }
    // equivalent to  <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = (MessageRenderer) new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
