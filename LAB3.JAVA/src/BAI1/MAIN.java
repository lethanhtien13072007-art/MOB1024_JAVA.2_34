package BAI1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MAIN {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList(
	            "An", "Bình", "Cường", "Dung", "Hiếu",
	            "Khanh", "Long", "Minh", "Phương", "Thanh"
	    ));

	   
	    System.out.println("Danh sách ban đầu:");
	    names.forEach(name -> System.out.println(name));

	    
	    System.out.println("\nTên có độ dài > 5:");
	    names.stream()
	            .filter(name -> name.length() > 5)
	            .forEach(name -> System.out.println(name));

	    
	    System.out.println("\nSắp xếp A-Z:");
	    List<String> sortedAZ = new ArrayList<>(names);
	    sortedAZ.sort((a, b) -> a.compareTo(b));
	    sortedAZ.forEach(name -> System.out.println(name));

	  
	    System.out.println("\nSắp xếp theo độ dài:");
	    List<String> sortedByLength = new ArrayList<>(names);
	    sortedByLength.sort((a, b) -> a.length() - b.length());
	    sortedByLength.forEach(name -> System.out.println(name));
	

	}
}
