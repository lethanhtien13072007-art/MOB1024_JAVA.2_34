package Bai1;

	import java.io.*;
	import java.util.*;

	public class Bai1 {
	    public static void main(String[] args) {

	        List<String> danhSach = new ArrayList<>();
	        danhSach.add("Nguyen Van A");
	        danhSach.add("Tran Thi B");
	        danhSach.add("Le Van C");
	        danhSach.add("Pham Thi D");

	        String fileName = "sinhvien.txt";

	        // ===== GHI FILE =====
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

	            for (int i = 0; i < danhSach.size(); i++) {
	                writer.write(danhSach.get(i));
	                writer.newLine();
	            }

	            System.out.println("Ghi file thành công!");

	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file!");
	        }

	        // ===== ĐỌC FILE =====
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

	            System.out.println("\nNội dung file:");
	            String line;

	            do {
	                line = reader.readLine();
	                if (line != null) {
	                    System.out.println(line);
	                }
	            } while (line != null);

	        } catch (IOException e) {
	            System.out.println("Lỗi khi đọc file!");
	        }
	    }
	}

