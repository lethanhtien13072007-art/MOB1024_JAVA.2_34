package bai3;

public class Employee {
	
	    public double getSalary() {
	        return 5000;
	    }

	    @Deprecated
	    public void oldMethod() {
	        System.out.println("Phương thức cũ");
	    }

	    public void newMethod() {
	        System.out.println("Phương thức mới");
	    }
	}

