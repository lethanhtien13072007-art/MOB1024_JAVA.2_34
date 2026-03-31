package BAI2;

public class Employee {
	 	private int id;
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getter & Setter
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // toString
	    @Override
	    public String toString() {
	        return String.format("%-10s %-20s %-10.0f\n", id, name, salary);
	    }
}
