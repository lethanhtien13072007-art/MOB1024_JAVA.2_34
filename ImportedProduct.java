package Slide;

class ImportedProduct extends Product {
	
	    private double importTaxRate; // 0 -> 1
	    private double shippingFee;   // >= 0

	    public ImportedProduct(String id, String name, double basePrice,
	                           double importTaxRate, double shippingFee) {
	        super(id, name, basePrice);
	        setImportTaxRate(importTaxRate);
	        setShippingFee(shippingFee);
	    }

	    public double getImportTaxRate() {
	        return importTaxRate;
	    }

	    public void setImportTaxRate(double importTaxRate) {
	        if (importTaxRate < 0 || importTaxRate > 1) {
	            throw new IllegalArgumentException("importTaxRate phải trong khoảng [0, 1]");
	        }
	        this.importTaxRate = importTaxRate;
	    }

	    public double getShippingFee() {
	        return shippingFee;
	    }

	    public void setShippingFee(double shippingFee) {
	        if (shippingFee < 0) {
	            throw new IllegalArgumentException("shippingFee phải >= 0");
	        }
	        this.shippingFee = shippingFee;
	    }

	    @Override
	    public double finalPrice() {
	        return getBasePrice() + getBasePrice() * importTaxRate + shippingFee;
	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "ImportedProduct{%s, importTaxRate=%.2f, shippingFee=%.2f}",
	                super.toString(), importTaxRate, shippingFee
	        );
	    }
	}

