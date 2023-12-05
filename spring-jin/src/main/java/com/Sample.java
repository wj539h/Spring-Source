package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Sample {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(User.class);
		User user = (User) ctx.getBean("user");
        System.out.println(user);
	}
}
