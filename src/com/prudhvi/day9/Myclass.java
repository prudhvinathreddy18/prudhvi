package com.prudhvi.day9;

class Myclass{
    class A {
        int i;

        void display() {
            System.out.println(i);
        }
    }

    class B extends A {
        int j;

        void display() {
            super.display(); // Call the display method of class A
            System.out.println(j);
        }
    }

     class inh{   
        public static void main(String[] args) {
        	Myclass obj=new Myclass();
          
            obj.i = 1;
            obj.j = 2;
            obj.display();
        }
    }
}
	
	


