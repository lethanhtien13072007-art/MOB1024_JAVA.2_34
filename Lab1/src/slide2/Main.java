package slide2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

       
        employees.add(new FullTimeEmployee("E01", "Minh", 12000000, 2000000, 500000));
        employees.add(new FullTimeEmployee("E02", "Lan", 15000000, 1000000, 0));
        employees.add(new PartTimeEmployee("E03", "Huy", 80, 60000));
        employees.add(new PartTimeEmployee("E04", "Nga", 60, 70000));
        employees.add(new Employee("E05", "Tuấn", 9000000));

        System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
        for (Employee e : employees) {
            System.out.printf("%s | Income = %.2f%n", e, e.income());
        }

        Employee maxIncome = Collections.max(
                employees, Comparator.comparingDouble(Employee::income)
        );

        System.out.println("\nNHÂN VIÊN CÓ THU NHẬP CAO NHẤT:");
        System.out.printf("%s | Income = %.2f%n",
                maxIncome, maxIncome.income());
    }
}



