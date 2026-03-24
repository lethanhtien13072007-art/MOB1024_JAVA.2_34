package slide3;
import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EmployeeService service = new EmployeeService();

	        while (true) {
	            System.out.println("\n===== MENU NHÂN VIÊN =====");
	            System.out.println("1. Thêm nhân viên");
	            System.out.println("2. Hiển thị danh sách");
	            System.out.println("3. Tìm theo mã");
	            System.out.println("4. Cập nhật lương theo mã");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn: ");

	            String choice = sc.nextLine().trim();

	            switch (choice) {
	                case "1" -> {
	                    System.out.print("Nhập id: ");
	                    String id = sc.nextLine();
	                    System.out.print("Nhập tên: ");
	                    String name = sc.nextLine();
	                    System.out.print("Nhập lương: ");
	                    double salary = Double.parseDouble(sc.nextLine());

	                    service.add(new Employee(id, name, salary));
	                    System.out.println("Đã thêm!");
	                }
	                case "2" -> service.showAll();
	                case "3" -> {
	                    System.out.print("Nhập id cần tìm: ");
	                    String id = sc.nextLine();
	                    Employee e = service.findById(id);
	                    System.out.println(e == null ? "Không thấy nhân viên!" : e);
	                }
	                case "4" -> {
	                    System.out.print("Nhập id cần cập nhật: ");
	                    String id = sc.nextLine();
	                    System.out.print("Nhập lương mới: ");
	                    double salary = Double.parseDouble(sc.nextLine());

	                    boolean ok = service.updateSalary(id, salary);
	                    System.out.println(ok ? "Cập nhật thành công!" : "Không tìm thấy nhân viên!");
	                }
	                case "0" -> {
	                    System.out.println("Thoát chương trình.");
	                    return;
	                }
	                default -> System.out.println("Lựa chọn không hợp lệ!");
	            }
	        }
	    }
	}


