package Bai4;

	import Bai2.Student;
	import java.io.*;
	import java.util.*;

	public class StudentService {

	    private List<Student> list = new ArrayList<>();
	    private final String fileName = "studentss.dat";

	    // ===== LOAD FILE =====
	    public void loadFromFile() {

	        File file = new File(fileName);

	        if (!file.exists() || file.length() == 0) {
	            System.out.println("⚠ File chưa tồn tại hoặc rỗng!");
	            list = new ArrayList<>();
	            return;
	        }

	        try (ObjectInputStream ois =
	                     new ObjectInputStream(new FileInputStream(file))) {

	            Object data = ois.readObject();

	            if (data instanceof List<?>) {
	                list = (List<Student>) data;
	                System.out.println("✅ Load dữ liệu thành công!");
	            } else {
	                System.out.println("⚠ Sai định dạng dữ liệu!");
	            }

	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("❌ Lỗi khi đọc file!");
	        }
	    }

	    // ===== SAVE FILE =====
	    public void saveToFile() {

	        try (ObjectOutputStream oos =
	                     new ObjectOutputStream(new FileOutputStream(fileName))) {

	            oos.writeObject(list);
	            System.out.println("💾 Lưu dữ liệu thành công!");

	        } catch (IOException e) {
	            System.out.println("❌ Lỗi khi ghi file!");
	        }
	    }

	    // ===== THÊM =====
	    public void addStudent(Student s) {
	        if (s != null) {
	            list.add(s);
	        }
	    }

	    // ===== HIỂN THỊ =====
	    public void displayAll() {

	        if (list.size() == 0) {
	            System.out.println("⚠ Danh sách trống!");
	            return;
	        }

	        int i = 0;
	        do {
	            System.out.println(list.get(i));
	            i++;
	        } while (i < list.size());
	    }
	}

