package constructor.deepCopy.House;

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

	    //deep copy
	    House(House h) {
	        this.houseName = h.houseName;
	        this.address = h.address;
	        this.price = h.price;
	        this.houseType = h.houseType;
	        this.o = new Owner();
	        this.o.age = h.o.age;
	        this.o.gender = h.o.gender;
	        this.o.nationality = h.o.nationality;
	        this.o.occupation = h.o.occupation;
	        this.o.ownerId = h.o.ownerId;
	        this.o.ownerName = h.o.ownerName;
	    }

	    public String toString() {
	        return "HouseName is: " + houseName + "\nAddress is: " + address + "\nPrice is: " + price + "\nHouseType is: " + houseType + "\nOwner is: " + o + "\n========================";
	    }
	

}
