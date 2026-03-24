package slide1;

public class Student  {
	
	    private String id;
	    private String name;
	    private StudentType type;

	    public Student(String id, String name, StudentType type) {
	        this.id = id;
	        this.name = name;
	        this.type = type;
	    }

	    public String getId() { return id; }
	    public String getName() { return name; }
	    public StudentType getType() { return type; }

	    public void setName(String name) { this.name = name; }
	    public void setType(StudentType type) { this.type = type; }

	    @Override
	    public String toString() {
	        return "ID: " + id + "\n" +
	               "Name: " + name + "\n" +
	               "StudentType: " + type + "\n";
	    }
	}


