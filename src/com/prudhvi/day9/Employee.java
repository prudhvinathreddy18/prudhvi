package com.prudhvi.day9;

public class Employee {
	private String name;
	private int id;
	static String companyname="TNS";
	static float salray=1.23f;
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
