package com.java.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
	
    AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/java/lifecycle/lifecycleconfig.xml");
      context.registerShutdownHook();
//    //Samosa samosa= (Samosa) context.getBean("s1");
//	//System.out.println(samosa);
//	
//   System.out.println("______________________________________________");
//   
//   
//	Pepsi p= (Pepsi) context.getBean("p1");
//	System.out.println(p);
       Example e=(Example) context.getBean("sub");
       System.out.println(e);
	
    }
}
