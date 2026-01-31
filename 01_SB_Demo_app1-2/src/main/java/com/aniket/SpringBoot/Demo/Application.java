package com.aniket.SpringBoot.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	Application bean=context.getBean(Application.class);
	System.out.println(bean);
	System.out.println(context.getBeanDefinitionCount());
	System.out.println(context.getClass().getName());
	}

}
