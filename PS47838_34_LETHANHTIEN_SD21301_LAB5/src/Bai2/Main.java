package Bai2;

	import java.io.*;
	import java.util.*;

	public class Main {
	    public static void main(String[] args) {

	        String fileName = "students.dat";

	        // ===== TẠO DANH SÁCH =====
	        List<Student> list = new ArrayList<>();
	        Collections.addAll(list,
	                new Student("SV01", "Nguyen Van A", 8.75),
	                new Student("SV02", "Tran Thi B", 8),
	                new Student("SV03", "Le Van C", 9.75)
	        );

	        // ===== GHI FILE =====
	        try (ObjectOutputStream oos =
	                     new ObjectOutputStream(new FileOutputStream(fileName))) {

	            oos.writeObject(list);
	            System.out.println("Ghi file thành công!");

	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file!");
	        }

	        // ===== ĐỌC FILE =====
	        try (ObjectInputStream ois =
	                     new ObjectInputStream(new FileInputStream(fileName))) {

	            List<Student> readList = (List<Student>) ois.readObject();

	            System.out.println("\nDanh sách đọc từ file:");

	            int i = 0;
	            while (i < readList.size()) {
	                System.out.println(readList.get(i));
	                i++;
	            }

	        } catch (IOException e) {
	            System.out.println("Lỗi khi đọc file!");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Không tìm thấy class!");
	        }
	    }
	}

