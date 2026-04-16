package Main;

import java.util.Scanner;

import Entity.Employee;
import Repository.EmployeeRepository;

public class Main {

	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        EmployeeRepository repo = new EmployeeRepository();
	        boolean running = true;

	        while (running) {
	            menu();
	            int choice = getChoice();

	            switch (choice) {

	                case 1 -> {
	                    System.out.println("Thêm Employee:");
	                    System.out.print("nhập name: ");
	                    String name = scanner.nextLine();

	                    System.out.print("Nhập lương: ");
	                    double salary = Double.parseDouble(scanner.nextLine());

	                    Employee emp = new Employee(null, name, salary);

	                    if (repo.addNew(emp)) {
	                        System.out.println("Thêm thành công!");
	                    } else {
	                        System.out.println("Thêm thất bại!");
	                    }

	                    repo.showAll();
	                }

	                case 2 -> {
	                    System.out.println("Liệt kê nhân viên:");
	                    repo.showAll();
	                }

	                case 3 -> {
	                    System.out.print("nhập ID: ");
	                    int id = Integer.parseInt(scanner.nextLine());

	                    Employee emp = repo.findByID(id);

	                    if (emp == null) {
	                        System.out.println("Không tìm thấy!");
	                    } else {
	                        System.out.println(emp);
	                    }
	                }

	                case 4 -> {
	                    System.out.print("Nhập ID để xoá: ");
	                    int id = Integer.parseInt(scanner.nextLine());

	                    if (repo.deleteEmp(id)) {
	                        System.out.println("Đã xóa!");
	                    } else {
	                        System.out.println("Xóa thất bại!");
	                    }

	                    repo.showAll();
	                }

	                case 5 -> {
	                    System.out.print("Nhập ID để cập nhật: ");
	                    int id = Integer.parseInt(scanner.nextLine());

	                    System.out.print("Tên Mới: ");
	                    String name = scanner.nextLine();

	                    System.out.print("Lương mới: ");
	                    double salary = Double.parseDouble(scanner.nextLine());

	                    Employee emp = new Employee(id, name, salary);

	                    if (repo.updateEmp(emp)) {
	                        System.out.println("Cập Nhật Thành Công!");
	                    } else {
	                        System.out.println("Cập Nhật Thất bại!");
	                    }

	                    repo.showAll();
	                }

	                case 0 -> {
	                    System.out.println("Exit!");
	                    running = false;
	                }

	                default -> System.out.println("Invalid choice!");
	            }
	        }
	    }   

	    static void menu() {
	        System.out.println("\n===== MENU =====");
	        System.out.println("1. Thêm Nhân Viên");
	        System.out.println("2. Hiển thị tất cả");
	        System.out.println("3. Tìm theo ID");
	        System.out.println("4. xóa");
	        System.out.println("5. Cập nhật");
	        System.out.println("0. Exit");
	        System.out.print("Choose: ");
	    }

	    static int getChoice() {
	        try {
	            return Integer.parseInt(scanner.nextLine());
	        } catch (Exception e) {
	            return -1;
	        }
	    }
	}

