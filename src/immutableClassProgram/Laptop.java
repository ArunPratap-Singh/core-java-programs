package immutableClassProgram;

public final class Laptop {
	
	    private final int laptopId;
	    private final String brand;
	    private final String model;
	    private final String processor;
	    private final double price;
	    private final int ram;
	    private final int storage;

	    Laptop(int laptopId, String brand, String model, String processor, double price, int ram, int storage) {

	        this.laptopId = laptopId;
	        this.brand = brand;
	        this.model = model;
	        this.processor = processor;
	        this.price = price;
	        this.ram = ram;
	        this.storage = storage;
	    }

	    public int getLaptopId() {
	        return laptopId;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public String getProcessor() {
	        return processor;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getRam() {
	        return ram;
	    }

	    public int getStorage() {
	        return storage;
	    }
	

}
