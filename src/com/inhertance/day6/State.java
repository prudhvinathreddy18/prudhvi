package com.inhertance.day6;

public class State extends Country {
	private String sname;

	public State() {
		super();
	}

	public State(String cname,String sname) {
		super(cname);
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "State [sname=" + sname + ", getCname()=" + getCname() + "]";
	}
	
	

}
