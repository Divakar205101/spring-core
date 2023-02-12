package com.java.lifecycle;

public class Samosa {
   public int price;

public Samosa() {
	
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	System.out.println("setting value");
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("init method");
}
public void destroy() {
	System.out.println("destroy method");
}
}
