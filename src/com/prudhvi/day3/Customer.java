//program to demonstrate constructor
package com.prudhvi.day3;

public class Customer {
	//data members
	private String customername;
	private String customercity;
	private int age;
	//default constructor
	public Customer() {
		
	}
	//parameterized constructor
	public Customer(String customername, String customercity, int age) {
		super();
		this.customername = customername;
		this.customercity = customercity;
		this.age = age;
		
	}//getter and setter
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//tostring
	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customercity=" + customercity + ", age=" + age
				+ ", getCustomername()=" + getCustomername() + ", getCustomercity()=" + getCustomercity()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
