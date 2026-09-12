package inheritancePrograming.Product;

public class ElectricalProduct extends Product{
	
	String category;
    int warrantyYears;
    boolean rechargeable;
    
    ElectricalProduct(){
    	
    }

    ElectricalProduct(String productName, int productId, double price, String brand, String category, int warrantyYears, boolean rechargeable) {
        super(productName, productId, price, brand);
        this.category = category;
        this.warrantyYears = warrantyYears;
        this.rechargeable = rechargeable;
    }
    @Override
    public String toString() {
    	return super.toString()+"Category is: " +category+"\nWarranty Years is: " +warrantyYears+"\nRechargeable is: " +rechargeable+"\n=========================";
    }

}
