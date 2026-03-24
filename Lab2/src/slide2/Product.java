package slide2;

public class Product {
	
	    private String id;
	    private String name;
	    private double price;
	    private ProductCategory category;

	    public Product(String id, String name, double price, ProductCategory category) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.category = category;
	    }

	    public ProductCategory getCategory() { return category; }
	    public double getPrice() { return price; }

	    @Override
	    public String toString() {
	        return String.format("Product{id='%s', name='%s', price=%.2f, category=%s}",
	                id, name, price, category);
	    }
	}


