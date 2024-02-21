package org.viajava.viajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.viajava.viajava.Provider.HelloWorldMessageProvider;
import org.viajava.viajava.Provider.MessageProvider;
import org.viajava.viajava.Renderer.MessageRenderer;
import org.viajava.viajava.Renderer.StandardOutMessageRenderer;

@SpringBootApplication
public class ViaJavaApplication {

    public static void main(String[] args) {

        SpringApplication.run(ViaJavaApplication.class, args);
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }

}
