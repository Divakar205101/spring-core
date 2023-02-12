package com.java.auto.wire;

public class Emp {
   private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("by seter method");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address address) {
	super();
	this.address = address;
	System.out.println("by constructor");
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
   
}
