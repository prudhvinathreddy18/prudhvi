package com.prudhvi.day1;

public class TypeConversion {
//	implict type casting
	
 public static void main(String[] args) {
	int a=10;
	float b=a;
	System.out.println(b);
	
	float c=100.001f;
	double d=c;
	System.out.println(d);
	
//	explict type conversion
	double aa=100.786868d;
	int bb = (int) aa;
	System.out.println(bb);
	
	int cc=65;
	char dd=(char) cc;
	System.out.println(dd);
	

}
}