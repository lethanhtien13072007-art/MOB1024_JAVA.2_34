package Bai3;

	import Bai2.Student;
	import java.io.*;
	import java.util.*;

	public class StudentService {

	    private List<Student> list = new ArrayList<>();
	    private final String fileName = "student.dat";

	    // ===== LOAD DATA =====
	    public void loadFromFile() {
	        try (ObjectInputStream ois =
	                     new ObjectInputStream(new FileInputStream(fileName))) {

	            Object data = ois.readObject();

	            if (data instanceof List<?>) {
	                list = (List<Student>) data;
	            }

	            System.out.println("Đã load dữ liệu từ file!");

	        } catch (FileNotFoundException e) {
	            list = new ArrayList<>();
	            System.out.println("Chưa có file, tạo mới danh sách!");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Lỗi khi đọc file!");
	        }
	    }

	    // ===== SAVE DATA =====
	    public void saveToFile() {
	        try (ObjectOutputStream oos =
	                     new ObjectOutputStream(new FileOutputStream(fileName))) {

	            oos.writeObject(list);
	            System.out.println("Đã lưu dữ liệu vào file!");

	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file!");
	        }
	    }

	    // ===== CRUD =====
	    public void addStudent(Student s) {
	        if (s != null) {
	            list.add(s);
	        }
	    }

	    public void displayAll() {
	        if (list.size() == 0) {
	            System.out.println("Danh sách trống!");
	            return;
	        }

	        int i = 0;
	        while (i < list.size()) {
	            System.out.println(list.get(i));
	            i++;
	        }
	    }
	}

