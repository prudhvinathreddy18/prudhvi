package com.prudhvi.day5;

public class Person {
          private String name;
          private String addres;
          private int age;
		public Person() {
				}
		public Person(String name, String addres, int age) {
			super();
			this.name = name;
			this.addres = addres;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddres() {
			return addres;
		}
		public void setAddres(String addres) {
			this.addres = addres;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", addres=" + addres + ", age=" + age + ", getName()=" + getName()
					+ ", getAddres()=" + getAddres() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
          
          
}
