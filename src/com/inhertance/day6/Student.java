package com.inhertance.day6;

public class Student extends Citizen{
	
	private int rollno;
	private String collegeName;
	public Student() {
		super();
	}
	public Student(String name,String aadhar,String address,int rollno, String collegeName) {
		super(name,aadhar,address);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadhar()=" + getAadhar() + ", getAddress()=" + getAddress() + "]";
	}
	

}
