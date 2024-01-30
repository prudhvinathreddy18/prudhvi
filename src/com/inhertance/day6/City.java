package com.inhertance.day6;

public class City extends State{
	private String cityname;

	public City() {
		super();
	}

	public City(String cname,String sname,String cityname) {
		super(cname,sname);
		this.cityname = cityname;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", getSname()=" + getSname() + ", getCname()=" + getCname() + "]";
	}
	
	

}
