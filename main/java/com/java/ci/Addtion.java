package com.java.ci;

public class Addtion {
   int a;
   int b;
  
public Addtion(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("constructor : int  int ");
}
public Addtion(double a, double b) {
	
	this.a = (int) a;
	this.b = (int) b;
	
	System.out.println("constructor : double  double ");
}public Addtion(String a, String b) {
	
	this.a = Integer.parseInt(a) ;
	this.b = Integer.parseInt(b) ;
	
	System.out.println("constructor : double  double ");
}
 public void dosum() {
	 System.out.println(this.a+this.b);
 }
 
}
