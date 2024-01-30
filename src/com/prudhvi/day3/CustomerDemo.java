package com.prudhvi.day3;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter city");
		city=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		
		Customer obj=new Customer();
		obj.setCustomername(name);
		obj.setCustomercity(city);
		obj.setAge(age);
		System.out.println(obj);
		
		System.out.println(".............");
		Customer o=new Customer(name,city,age);
		System.out.println("enter name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("enter city");
		city=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		o.setAge(age);
		o.setCustomercity(city);
		o.setCustomername(name);
        System.out.println(o);
		
	}

}
