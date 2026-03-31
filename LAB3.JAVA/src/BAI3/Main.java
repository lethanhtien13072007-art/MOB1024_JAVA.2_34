package BAI3;

import BAI2.Employee;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	    public static void main(String[] args) {

	        List<Employee> employees = Arrays.asList(
	                new Employee(1, "An", 12),
	                new Employee(2, "Bình", 18),
	                new Employee(3, "Anh", 20),
	                new Employee(4, "Dung", 14),
	                new Employee(5, "Đức", 25),
	                new Employee(6, "Hiếu", 16),
	                new Employee(7, "Phương", 25),
	                new Employee(8, "Na", 17)
	        );

	        // 1. Tổng lương
	        double totalSalary = employees.stream()
	                .mapToDouble(Employee::getSalary)
	                .sum();

	        // 2. Lương trung bình
	        double avgSalary = employees.stream()
	                .mapToDouble(Employee::getSalary)
	                .average()
	                .orElse(0);

	        // 3. Nhân viên lương cao nhất
	        Employee maxSalaryEmp = employees.stream()
	                .max(Comparator.comparingDouble(Employee::getSalary))
	                .orElse(null);

	        
	        System.out.println("===== THỐNG KÊ LƯƠNG =====");
	        System.out.println("Tổng lương: " + totalSalary);
	        System.out.println("Lương trung bình: " + avgSalary);
	        System.out.println("Nhân viên lương cao nhất: " + maxSalaryEmp.getName() + " - lương " + maxSalaryEmp.getSalary());
	    }
	}

