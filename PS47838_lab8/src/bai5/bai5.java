package bai5;

import java.util.ArrayList;

public class bai5 {
	
	    public static void main(String[] args) {
	        ArrayList<Integer> scores = new ArrayList<>();

	        scores.add(8);
	        scores.add(9);
	        scores.add(null);
	        scores.add(7);
	        scores.add(6);

	        double sum = 0;
	        int count = 0;

	        for (Integer score : scores) {
	            if (score != null) {
	                sum += score;
	                count++;
	            }
	        }

	        double avg = sum / count;

	        String rank = avg >= 8 ? "Giỏi" :
	                      avg >= 6.5 ? "Khá" : "Trung bình";

	        String result = """
	                ===== KẾT QUẢ =====
	                Danh sách điểm: %s
	                Điểm trung bình: %.2f
	                Xếp loại: %s
	                """.formatted(scores, avg, rank);

	        System.out.println(result);
	    }
	}

