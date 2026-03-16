package Slide;

public class Product {
    private String id;
    private String name;
    private double basePrice;

    public Product(String id, String name, double basePrice) {
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }

    public String getId() { return id; }
    public void setId(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("id không được rỗng");
        this.id = id.trim();
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name == null) ? "" : name.trim();
    }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) {
        if (basePrice < 0)
            throw new IllegalArgumentException("basePrice phải >= 0");
        this.basePrice = basePrice;
    }

    public double finalPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("Product{id='%s', name='%s', basePrice=%.2f}", id, name, basePrice);
    }
}