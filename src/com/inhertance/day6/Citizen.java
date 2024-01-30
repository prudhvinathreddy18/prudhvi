package com.inhertance.day6;

public class Citizen {
           private String Name;
           private String aadhar;
           private String address;
		public Citizen() {
			System.out.println("citizen");
			
		}
		public Citizen(String name, String aadhar, String address) {
			
			Name = name;
			this.aadhar = aadhar;
			this.address = address;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAadhar() {
			return aadhar;
		}
		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Citizen [Name=" + Name + ", aadhar=" + aadhar + ", address=" + address + ", getName()=" + getName()
					+ ", getAadhar()=" + getAadhar() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		
           
           
}
