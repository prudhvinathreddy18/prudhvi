package com.hirarical.day6;

public class Sbi extends Rbi {
	private String Cname;

	public Sbi() {
		super();
	}

	public Sbi(String pname,String cname) {
		super(pname);
		Cname = cname;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Sbi [Cname=" + Cname + ", getPname()=" + getPname() + "]";
	}
	
	

}
