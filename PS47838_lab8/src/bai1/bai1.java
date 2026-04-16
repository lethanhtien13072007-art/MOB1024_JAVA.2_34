package bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class bai1 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> scores = new ArrayList<>();

	        System.out.println("Nhập 5 điểm kiểm tra:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Điểm " + (i + 1) + ": ");
	            String input = sc.nextLine();

	            if (input.isEmpty()) {
	                scores.add(null);
	            } else {
	                scores.add(Integer.parseInt(input));
	            }
	        }

	        System.out.println("Danh sách điểm: " + scores);

	        double sum = 0;
	        int count = 0;

	        for (Integer score : scores) {
	            if (score != null) {
	                sum += score;   	                count++;
	            }
	        }

	        double avg = (count == 0) ? 0 : sum / count;

	        System.out.println("Điểm trung bình: " + avg);

	        if (avg >= 8) {
	            System.out.println("Xếp loại: Giỏi");
	        } else if (avg >= 6.5) {
	            System.out.println("Xếp loại: Khá");
	        } else {
	            System.out.println("Xếp loại: Trung bình");
	        }

	        sc.close();
	    }
}
