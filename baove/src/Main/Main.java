package Main;

import java.util.Scanner;
import connect.AssetService;
import Entity.Asset;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AssetService service = new AssetService();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Asset");
            System.out.println("2. Show List");
            System.out.println("3. Update Maintenance");
            System.out.println("4. Delete");
            System.out.println("5. Filter >100tr");
            System.out.println("6. Max Price");
            System.out.println("0. Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Tên: ");
                        String name = sc.nextLine();
                        if (name.isEmpty()) throw new Exception("Tên không được rỗng");

                        System.out.print("Cấu hình: ");
                        String spec = sc.nextLine();

                        System.out.print("Giá: ");
                        double price = Double.parseDouble(sc.nextLine());

                        System.out.print("Chu kỳ: ");
                        int cycle = Integer.parseInt(sc.nextLine());

                        System.out.print("Location: ");
                        String loc = sc.nextLine();

                        System.out.print("Trạng thái (1/0): ");
                        boolean status = sc.nextLine().equals("1");

                        Asset a = new Asset(0, name, spec, price, cycle, loc, status);
                        service.addAsset(a);

                    } catch (NumberFormatException e) {
                        System.out.println("❌ Sai định dạng số!");
                    } catch (Exception e) {
                        System.out.println("❌ " + e.getMessage());
                    }
                    break;

                case 2:
                    service.display();
                    break;

                case 3:
                    try {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Chu kỳ mới: ");
                        int cycle = Integer.parseInt(sc.nextLine());
                        service.updateMaintenance(id, cycle);
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Sai số!");
                    }
                    break;

                case 4:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    service.deleteAsset(id);
                    break;

                case 5:
                    service.filterHighValue();
                    break;

                case 6:
                    service.maxPrice();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}