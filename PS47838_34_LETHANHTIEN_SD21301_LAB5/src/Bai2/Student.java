package Bai2;

	import java.io.Serializable;

	public class Student implements Serializable {

	    private String id, name;
	    private double gpa;

	    
	    public Student(String id, String name, double gpa) {
	        this.id = id;
	        this.name = name;
	        this.gpa = gpa;
	    }

	    // Getter
	    public String getId() { return id; }
	    public String getName() { return name; }
	    public double getGpa() { return gpa; }

	    // Setter
	    public void setId(String id) { this.id = id; }
	    public void setName(String name) { this.name = name; }
	    public void setGpa(double gpa) { this.gpa = gpa; }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Student[");
	        sb.append("id=").append(id).append(", ");
	        sb.append("name=").append(name).append(", ");
	        sb.append("gpa=").append(gpa);
	        sb.append("]");
	        return sb.toString();
	    }
	}

