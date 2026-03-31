package bai1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Thêm sinh viên
    public void addStudent(String id, String name, double gpa) {

        // Validate
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không được rỗng!");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được rỗng!");
        }

        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA phải nằm trong khoảng 0 - 4!");
        }

        students.add(new Student(id, name, gpa));
    }

    // Hiển thị danh sách
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }

        for (Student s : students) {
            s.inThongTin();
        }
    }
}