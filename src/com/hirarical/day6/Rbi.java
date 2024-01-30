package com.hirarical.day6;

public class Rbi {
	private String Pname;

	public Rbi() {
		super();
	}

	public Rbi(String pname) {
		super();
		Pname = pname;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	@Override
	public String toString() {
		return "Rbi [Pname=" + Pname + "]";
	}
	

}
