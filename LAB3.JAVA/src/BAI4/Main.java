package BAI4;
import java.util.*;
import java.util.stream.*;

public class Main {

	    public static void main(String[] args) {

	        List<Student> students = Arrays.asList(
	                new Student(1, "An", StudentType.REGULAR, 3.0),
	                new Student(2, "Bình", StudentType.PART_TIME, 2.8),
	                new Student(3, "Đức", StudentType.INTERNATIONAL, 3.5),
	                new Student(4, "Tiến", StudentType.INTERNATIONAL, 3.1),
	                new Student(5, "Na", StudentType.REGULAR, 3.6),
	                new Student(6, "Diễm", StudentType.INTERNATIONAL, 3.8),
	                new Student(7, "Hiếu", StudentType.PART_TIME, 2.9),
	                new Student(8, "Linh", StudentType.REGULAR, 3.4),
	                new Student(9, "Hùng", StudentType.INTERNATIONAL, 3.3),
	                new Student(10, "Anh", StudentType.REGULAR, 2.7)
	        );

	        // 1. Lọc INTERNATIONAL có GPA >= 3.2
	        System.out.println("Sinh viên INTERNATIONAL GPA >= 3.2:");
	        System.out.println("----------------------------------------------------------");
	        System.out.printf("%-10s %-15s %-15s %-10s\n", "ID", "Name", "Type", "GPA");
	        System.out.println("----------------------------------------------------------");
	        students.stream()
	                .filter(s -> s.getType() == StudentType.INTERNATIONAL)
	                .filter(s -> s.getGpa() >= 3.2)
	                .forEach(System.out::println);

	        // 2. Sắp xếp theo GPA giảm dần + lấy top 3
	        System.out.println("\nTop 3 sinh viên GPA cao nhất:");
	        System.out.println("----------------------------------------------------------");
	        System.out.printf("%-10s %-15s %-15s %-10s\n", "ID", "Name", "Type", "GPA");
	        System.out.println("----------------------------------------------------------");
	        students.stream()
	                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
	                .limit(3)
	                .forEach(System.out::println);
	        
	        // 3. Lấy danh sách tên sinh viên PART_TIME
	        System.out.println("\nDanh sách tên sinh viên PART_TIME:");
	        students.stream()
	                .filter(s -> s.getType() == StudentType.PART_TIME)
	                .map(Student::getName)
	                .forEach(System.out::println);

	        
	    }
	}

