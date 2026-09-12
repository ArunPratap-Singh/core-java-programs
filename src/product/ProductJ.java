package product;

public class ProductJ {
	
	String brandname;
	int price;
	double quantity;
	int productid;

	ProductJ(){
		
	}
	
	ProductJ(String brandname, int price, double quantity, int productid){
		this.brandname = brandname;
		this.price = price;
		this.quantity = quantity;
		this.productid = productid;
	}
	
	public String toString() {
		return "Brandname is: " +brandname+"\tPrice is: " +price+"\tQuantity is: " +quantity+"\tProductid is: " +productid;
	}

}
