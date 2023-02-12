package com.java.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
             ApplicationContext context=new  ClassPathXmlApplicationContext("com/java/auto/wire/autoconfig.xml");
             Emp e=(Emp) context.getBean("emp1");
             System.out.println(e);
	}

}
