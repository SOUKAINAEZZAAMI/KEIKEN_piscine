package org.viaxml.viaxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ViaXmlApplication {

    public static void main(String[] args) {

        SpringApplication.run(ViaXmlApplication.class, args);

            ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.viaxml");
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();

    }

}
