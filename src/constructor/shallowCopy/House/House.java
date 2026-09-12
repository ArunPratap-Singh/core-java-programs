package constructor.shallowCopy.House;

public class House {
	
	    String houseName;
	    String address;
	    int price;
	    String houseType;
	    Owner o;

	    House() {
	    }

	    House(String houseName, String address, int price, String houseType, Owner o) {
	        this.houseName = houseName;
	        this.address = address;
	        this.price = price;
	        this.houseType = houseType;
	        this.o = o;
	    }

	    House(House h) {
	        this.houseName = h.houseName;
	        this.address = h.address;
	        this.price = h.price;
	        this.houseType = h.houseType;
	        this.o = h.o;
	    }

	    public String toString() {
	        return "HouseName is: " + houseName + "\nAddress is: " + address + "\nPrice is: " + price + "\nHouseType is: " + houseType + "\nOwner is: " + o + "\n========================";
	    }
	

}
