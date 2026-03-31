package BAI2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAIN {
			public static void main(String[] args) {

		        List<Employee> employees = Arrays.asList(
		                new Employee(1, "An", 12000000),
		                new Employee(2, "Bình", 18000000),
		                new Employee(3, "Anh", 20000000),
		                new Employee(4, "Dung", 14000000),
		                new Employee(5, "Đức", 25000000),
		                new Employee(6, "Hiếu", 16000000),
		                new Employee(7, "Phương", 13000000),
		                new Employee(8, "Na", 17000000)
		        );
		        System.out.println("Nhân viên lương >= 15tr:");
		        System.out.println("--------------------------------------------------------");
		        System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Salary");
		        System.out.println("--------------------------------------------------------");
		        employees.stream()
		                .filter(e -> e.getSalary() >= 15_000_000)
		                .forEach(System.out::println);
		        System.out.println("--------------------------------------------------------");
		        
		        // 2. Sắp xếp theo salary giảm dần
		        System.out.println("\nSắp xếp lương giảm dần:");
		        
		        System.out.println("--------------------------------------------------------");
		        System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Salary");
		        System.out.println("--------------------------------------------------------");
		        employees.stream()
		                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
		                .forEach(System.out::println);
		        System.out.println("--------------------------------------------------------");
		        
		        // 3. Lấy danh sách tên (map)
		        System.out.println("\nDanh sách tên:");
		        List<String> names = employees.stream()
		                .map(Employee::getName)
		                .collect(Collectors.toList());

		        names.forEach(System.out::println);
		        System.out.println("--------------------------------------------------------");
		        
		        // 4. Đếm tên bắt đầu bằng "A" (không phân biệt hoa thường)
		        long count = employees.stream()
		                .filter(e -> e.getName().toLowerCase().startsWith("a"))
		                .count();

		        System.out.println("\nSố nhân viên tên bắt đầu bằng A: " + count);
		    }
		

	}


