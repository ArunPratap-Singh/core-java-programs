package datatransferobject;

public class ProductDTO {
	
	private int productid;
	private String productname;
	private int productprice;
	private String productbrand;
	
	ProductDTO(){
		
	}
	
	public void setProductID(int productid) {
		this.productid = productid;
	}
	public int getProductID() {
		return productid;
	}
	public void setProductName(String productname) {
		this.productname = productname;
	}
	public String getProductName() {
		return productname;
	}
	public void setProductPrice(int productprice) {
		this.productprice = productprice;
	}
	public int getProductPrice() {
		return productprice;
	}
	public void setProductBrand(String productbrand) {
		this.productbrand = productbrand;
	}
	public String getProductBrand() {
		return productbrand;
	}
	

}
