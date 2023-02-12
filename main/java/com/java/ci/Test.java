package com.java.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/java/ci/ciconfig.xml");
	  Person p = (Person) context.getBean("person");
	  System.out.println(p);
	   Addtion a= (Addtion) context.getBean("sum");
	   a.dosum();
}
}
