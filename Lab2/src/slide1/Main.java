package slide1;
import java.util.*;

public class Main {
	
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("SV01", "An", StudentType.REGULAR));
	        students.add(new Student("SV02", "Bình", StudentType.PART_TIME));
	        students.add(new Student("SV03", "Chi", StudentType.INTERNATIONAL));
	        students.add(new Student("SV04", "Dũng", StudentType.REGULAR));
	        students.add(new Student("SV05", "Hà", StudentType.PART_TIME));
	        students.add(new Student("SV06", "Lan", StudentType.INTERNATIONAL));

	        System.out.println("=== DANH SÁCH TOÀN BỘ SINH VIÊN ===");
	        students.forEach(System.out::println);

	        System.out.println("\n=== DANH SÁCH SINH VIÊN THEO TỪNG LOẠI ===");
	        for (StudentType t : StudentType.values()) {
	            System.out.println("-- " + t + " --");
	            students.stream()
	                    .filter(s -> s.getType() == t)
	                    .forEach(System.out::println);
	        }

	        System.out.println("\n=== ĐẾM SỐ LƯỢNG SINH VIÊN MỖI LOẠI ===");
	        Map<StudentType, Integer> count = new HashMap<>();
	        for (Student s : students) {
	            count.put(s.getType(), count.getOrDefault(s.getType(), 0) + 1);
	        }
	        for (StudentType t : StudentType.values()) {
	            System.out.println(t + ": " + count.getOrDefault(t, 0));
	        }
	    }
	}


