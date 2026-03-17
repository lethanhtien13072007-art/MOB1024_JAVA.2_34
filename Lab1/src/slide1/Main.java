package slide1;

        import java.util.ArrayList;
        import java.util.List;

public class Main {	

	    public static void main(String[] args) {

	        List<Product> products = new ArrayList<>();

	        products.add(new Product("P01", "Notebook", 25000));
	        products.add(new Product("P02", "Pen", 8000));
	        products.add(new Product("P03", "Backpack", 150000));

	        products.add(new ImportedProduct("IP01", "Keyboard", 300000, 0.10, 20000));
	        products.add(new ImportedProduct("IP02", "Mouse", 200000, 0.05, 15000));

	        System.out.println("=== DANH SÁCH SẢN PHẨM ===");

	        for (Product p : products) {
	            System.out.printf("%s | finalPrice = %.2f%n", p.toString(), p.finalPrice());
	        }

	       
	        Product maxProduct = products.get(0);

	        for (Product p : products) {
	            if (p.finalPrice() > maxProduct.finalPrice()) {
	                maxProduct = p;
	            }
	        }

	        System.out.println("\n=== SẢN PHẨM CÓ GIÁ CUỐI CAO NHẤT ===");
	        System.out.printf("%s | finalPrice = %.2f%n", maxProduct.toString(), maxProduct.finalPrice());
	    }
	}
	