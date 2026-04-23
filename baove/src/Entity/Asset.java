package Entity;

public class Asset {
    private int id;
    private String assetName;
    private String specifications;
    private double purchasePrice;
    private int maintenanceCycle;
    private String location;
    private boolean isOperational;

    public Asset() {}

    public Asset(int id, String assetName, String specifications,
                 double purchasePrice, int maintenanceCycle,
                 String location, boolean isOperational) {
        this.id = id;
        this.assetName = assetName;
        this.specifications = specifications;
        this.purchasePrice = purchasePrice;
        this.maintenanceCycle = maintenanceCycle;
        this.location = location;
        this.isOperational = isOperational;
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public String getSpecifications() { return specifications; }
    public void setSpecifications(String specifications) { this.specifications = specifications; }

    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

    public int getMaintenanceCycle() { return maintenanceCycle; }
    public void setMaintenanceCycle(int maintenanceCycle) { this.maintenanceCycle = maintenanceCycle; }

    public String getLocation() {
       
        return location.toUpperCase();
    }

    public void setLocation(String location) { this.location = location; }

    public boolean isOperational() { return isOperational; }
    public void setOperational(boolean operational) { isOperational = operational; }
}
