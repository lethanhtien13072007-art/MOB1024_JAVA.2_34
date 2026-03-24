package slide3;

public class Employee {
	
	    private String id;
	    private String name;
	    private double salary;

	    public Employee(String id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getId() { return id; }
	    public String getName() { return name; }
	    public double getSalary() { return salary; }

	    public void setName(String name) { this.name = name; }
	    public void setSalary(double salary) { this.salary = salary; }

	    @Override
	    public String toString() {
	        return String.format("Employee{id='%s', name='%s', salary=%.2f}", id, name, salary);
	    }
	}


