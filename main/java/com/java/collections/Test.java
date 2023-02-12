package com.java.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/java/collections/collectioconfig.xml");
		Emp em = (Emp) context.getBean("emp1");
       System.out.println(em.getName());
       System.out.println(em.getPhones());
       System.out.println(em.getAddress());
       System.out.println(em.getCourses());
	}

}
