package slide3;
import java.util.*;

public class EmployeeService {
	

	    private final List<Employee> employees = new ArrayList<>();

	    public void add(Employee e) {
	        employees.add(e);
	    }

	    public void showAll() {
	        if (employees.isEmpty()) {
	            System.out.println("Danh sách trống!");
	            return;
	        }
	        employees.forEach(System.out::println);
	    }

	    public Employee findById(String id) {
	        for (Employee e : employees) {
	            if (e.getId().equalsIgnoreCase(id)) return e;
	        }
	        return null;
	    }

	    public boolean updateSalary(String id, double newSalary) {
	        Employee e = findById(id);
	        if (e == null) return false;
	        e.setSalary(newSalary);
	        return true;
	    }
	}


