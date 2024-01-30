package com.hirarical.day6;

public class Idfc extends Rbi {
	private String c1name;

	public Idfc() {
		super();
	}

	public Idfc(String pname,String c1name) {
		super(pname);
		this.c1name = c1name;
	}

	public String getC1name() {
		return c1name;
	}

	public void setC1name(String c1name) {
		this.c1name = c1name;
	}

	@Override
	public String toString() {
		return "Idfc [c1name=" + c1name + ", getPname()=" + getPname() + "]";
	}
	
	
	
	

}
