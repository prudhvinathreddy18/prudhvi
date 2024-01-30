package com.prudhvi.day7;

public class Employee {
            private String emid;

			public Employee() {
				
			}

			public Employee(String emid) {
				
				this.emid = emid;
			}

			public String getEmid() {
				return emid;
			}

			public void setEmid(String emid) {
				this.emid = emid;
			}

			@Override
			public String toString() {
				return "Employee [emid=" + emid + "]";
			}
			
            
}
