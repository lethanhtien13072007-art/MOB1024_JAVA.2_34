package slide2;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P01", "Gạo", 20000, ProductCategory.FOOD));
        products.add(new Product("P02", "Sữa", 30000, ProductCategory.FOOD));
        products.add(new Product("P03", "TV", 5000000, ProductCategory.ELECTRONIC));
        products.add(new Product("P04", "Laptop", 12000000, ProductCategory.ELECTRONIC));
        products.add(new Product("P05", "Tai nghe", 450000, ProductCategory.ELECTRONIC));
        products.add(new Product("P06", "Áo thun", 150000, ProductCategory.CLOTHING));
        products.add(new Product("P07", "Quần jean", 300000, ProductCategory.CLOTHING));
        products.add(new Product("P08", "Bánh", 25000, ProductCategory.FOOD));
        products.add(new Product("P09", "Thịt", 250000, ProductCategory.FOOD));
        products.add(new Product("P010", "Điện Thoại", 25000000, ProductCategory.ELECTRONIC));

        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        products.forEach(System.out::println);

        Map<ProductCategory, Integer> countMap = new HashMap<>();
        Map<ProductCategory, Double> totalMap = new HashMap<>();

        for (Product p : products) {
            ProductCategory c = p.getCategory();
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            totalMap.put(c, totalMap.getOrDefault(c, 0.0) + p.getPrice());
        }

        System.out.println("\n=== SỐ LƯỢNG SẢN PHẨM THEO LOẠI ===");
        for (Map.Entry<ProductCategory, Integer> e : countMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("\n=== TỔNG GIÁ TRỊ SẢN PHẨM THEO LOẠI ===");
        for (Map.Entry<ProductCategory, Double> e : totalMap.entrySet()) {
            System.out.println(e.getKey() + ": " + String.format("%.2f", e.getValue()));
        }

    }
}