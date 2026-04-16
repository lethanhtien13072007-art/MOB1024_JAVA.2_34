package bai2;

import java.util.ArrayList;
import java.util.List;

public class bai2 {
	
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();

	        students.add(new Student("SV01", "An", 3.5));
	        students.add(new Student("SV02", "Bình", 2.8));
	        students.add(new Student("SV03", "Cường", 3.7));
	        
	        for (Student s : students) {
	            System.out.println("MSSV: " + s.id());
	            System.out.println("Tên: " + s.name());
	            System.out.println("GPA: " + s.gpa());
	            System.out.println("----------------");
	        }

	        System.out.println("Danh sách sinh viên:");

	        for (Student s : students) {
	            System.out.println(s);
	        }

	        System.out.println("\nSinh viên đủ điều kiện học bổng:");

	        for (Student s : students) {
	            if (s.isScholarshipEligible()) {
	                System.out.println(s);
	            }
	        }
	    }
	}
