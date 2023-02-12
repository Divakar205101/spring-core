package com.java.springcore;

public class Student {
    private int id;
    private String studentname;
    private String studentaddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String studentname, String studentaddress) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", studentaddress=" + studentaddress + "]";
	}
    
}
