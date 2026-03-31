package BAI4;

public class Student {

	    private int id;
	    private String name;
	    private StudentType type;
	    private double gpa;

	    // Constructor
	    public Student(int id, String name, StudentType type, double gpa) {
	        this.id = id;
	        this.name = name;
	        this.type = type;
	        this.gpa = gpa;
	    }

	    // Getter
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public StudentType getType() {
	        return type;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    // Setter
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setType(StudentType type) {
	        this.type = type;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    // toString
	    @Override
	    public String toString() {
	        return String.format("%-10s %-15s %-15s %-10.0f\n", id, name, type, gpa);
	    }
}
