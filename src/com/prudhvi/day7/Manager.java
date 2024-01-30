package com.prudhvi.day7;

public class Manager extends Employee {
       private String mid;

	public Manager() {
		super();
	}

	public Manager(String eid,String mid) {
		super(eid);
		this.mid = mid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", getEmid()=" + getEmid() + "]";
	}
	
       
       
}
