package org.aop.spring_aop;

import org.aop.spring_aop.Service.test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value={"org.aop.spring_aop.Service","org.aop.spring_aop.Aspect"})
public class SpringAopApplication {

	public static void main(String[] args) throws InterruptedException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		test sampleClass = context.getBean(test.class);
		sampleClass.timeIt();
	}

}
