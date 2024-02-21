package org.viaannotations.viaannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.viaannotations.viaannotations.Renderer.HelloWorldConfiguration;
import org.viaannotations.viaannotations.Renderer.MessageRenderer;

@SpringBootApplication
public class ViaAnnotationsApplication {

    public static void main(String[] args) {

        SpringApplication.run(ViaAnnotationsApplication.class, args);

            ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();


    }

}
