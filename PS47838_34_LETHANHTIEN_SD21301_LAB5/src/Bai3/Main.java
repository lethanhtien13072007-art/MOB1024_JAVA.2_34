package Bai3;

	import Bai2.Student;
	import java.util.*;

	public class Main {
	    public static void main(String[] args) {

	        StudentService service = new StudentService();
	        Scanner sc = new Scanner(System.in);

	        // Load dữ liệu
	        service.loadFromFile();

	        int choice;

	        do {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Thêm dữ liệu mẫu");
	            System.out.println("2. Thêm sinh viên");
	            System.out.println("3. Hiển thị danh sách");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn: ");

	            choice = Integer.parseInt(sc.nextLine());

	            switch (choice) {

	                case 1 -> {
	                    List<Student> temp = Arrays.asList(
	                            new Student("SV01", "Nguyen Van A", 8.5),
	                            new Student("SV02", "Tran Thi B", 7.2),
	                            new Student("SV03", "Le Van C", 9.1),
	                            new Student("SV04", "Pham Thi D", 6.8),
	                            new Student("SV05", "Hoang Van E", 8.0)
	                    );

	                    for (Student s : temp) {
	                        service.addStudent(s);
	                    }

	                    System.out.println("Đã thêm dữ liệu mẫu!");
	                }

	                case 2 -> {
	                    System.out.print("Nhập ID: ");
	                    String id = sc.nextLine();

	                    System.out.print("Nhập tên: ");
	                    String name = sc.nextLine();

	                    System.out.print("Nhập GPA: ");
	                    double gpa = Double.parseDouble(sc.nextLine());

	                    service.addStudent(new Student(id, name, gpa));
	                }

	                case 3 -> service.displayAll();

	                case 0 -> System.out.println("Thoát chương trình!");

	                default -> System.out.println("Lựa chọn không hợp lệ!");
	            }

	        } while (choice != 0);

	        // Lưu dữ liệu
	        service.saveToFile();
	    }
}
