package com.java.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
   private double price;

 public Pepsi() {
	
 }


public Pepsi(double price) {
	super();
	this.price = price;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}


public void afterPropertiesSet() throws Exception {
	System.out.println("taking pepsi : init method");
	
}

public void destroy() throws Exception {
	System.out.println("Going to put bottle back to shop : destroy");
	
}  

}


















