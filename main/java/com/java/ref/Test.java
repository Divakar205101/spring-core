package com.java.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/java/ref/refconfig.xml");
     A a = (A) context.getBean("aref");
     System.out.println(a.getX());
     System.out.println(a.getObj().getY());
       System.out.println(a);
	}

}
