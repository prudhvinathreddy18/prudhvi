package com.prudhvi.day3;

public class OopsConcepts {
	//data members
	private String name;
	private String gender;
	private int age;
	private int income;
	private int tax;
	
	//getter and setter method 
	//to add getter and setter method u need to right click->source->generate getters and setters method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "OopsConcepts [name=" + name + ", gender=" + gender + ", age=" + age + ", income=" + income + ", tax="
				+ tax + "]";
	}
	
	
	
	
	}


