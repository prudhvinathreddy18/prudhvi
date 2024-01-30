//program to demonstrate packages and access modifiers
package com.prudhvi.day5;


public class AccessModifiers {
          //default,public,private and protected variables
	      int vardefault=10;
	      public int varpulic=20;
	      private int varprivate=30;
	      protected int varprotected=40;
	      //default,public private and protected methods
	      void defaultMethod() {
	    	  System.out.println("default variable"+ vardefault);
	    	  System.out.println("default method");
	    	  
	      }
	   public    void publicMethod() {
	    	  System.out.println("public variable"+ varprivate);
	    	  System.out.println("public method");
	    	  
	      }
	private   void privateMethod() {
	    	  System.out.println("priavte variable"+ varprivate);
	    	  System.out.println("private method");
	    	  
	      }
	protected  void protectedMethod() {
   	  System.out.println("protected variable"+ varprotected);
   	  System.out.println("protected method");
   	  
     }

}
