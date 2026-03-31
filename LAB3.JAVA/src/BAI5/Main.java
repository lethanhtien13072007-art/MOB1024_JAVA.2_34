package BAI5;

import BAI4.Student;
import BAI4.StudentType;

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

	        // 1. Đếm số sinh viên theo từng loại
	        Map<StudentType, Long> countMap = students.stream()
	                .collect(Collectors.groupingBy(
	                        Student::getType,
	                        Collectors.counting()
	                ));

	        System.out.println("Số lượng sinh viên theo loại:");
	        countMap.forEach((type, count) ->
	                System.out.println(type + ": " + count)
	        );

	        // 2. GPA trung bình theo từng loại
	        Map<StudentType, Double> avgMap = students.stream()
	                .collect(Collectors.groupingBy(
	                        Student::getType,
	                        Collectors.averagingDouble(Student::getGpa)
	                ));

	        System.out.println("\nGPA trung bình theo loại:");
	        avgMap.forEach((type, avg) ->
	                System.out.println(type + ": " + avg)
	        );

	        // 3. Loại có GPA trung bình cao nhất
	        Map.Entry<StudentType, Double> maxEntry = avgMap.entrySet().stream()
	                .max(Map.Entry.comparingByValue())
	                .orElse(null);

	        System.out.println("\nLoại có GPA trung bình cao nhất:");
	        if (maxEntry != null) {
	            System.out.println(maxEntry.getKey() + " - GPA: " + maxEntry.getValue());
	        }
	    }

}  
