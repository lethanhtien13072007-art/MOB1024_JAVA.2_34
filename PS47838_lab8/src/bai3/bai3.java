package bai3;

@Developer(name = "Thanh Tien", version = "1.0")
public class bai3 {
    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.println("Lương manager: " + manager.getSalary());

        Class<bai3> obj = bai3.class;

        if (obj.isAnnotationPresent(Developer.class)) {
            Developer dev = obj.getAnnotation(Developer.class);

            System.out.println("Developer: " + dev.name());
            System.out.println("Version: " + dev.version());
        }
    }
}