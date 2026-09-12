package datatransferobject;

public class ProductDTODriver {

	public static void main(String[] args) {
		
		ProductDTO p1 = new ProductDTO();
		ProductDTO p2 = new ProductDTO();
		ProductDTO p3 = new ProductDTO();
		ProductDTO p4 = new ProductDTO();
		ProductDTO p5 = new ProductDTO();
		ProductDTO p6 = new ProductDTO();
		ProductDTO p7 = new ProductDTO();
		
		p1.setProductName("Shirt");	p1.setProductID(123456);	p1.setProductPrice(500);	p1.setProductBrand("Zara");
		p2.setProductName("Jeans");	p2.setProductID(456123);	p2.setProductPrice(1200);	p2.setProductBrand("Livesmart");
		p3.setProductName("Biscuit");	p3.setProductID(789456);	p3.setProductPrice(110);	p3.setProductBrand("Parle");
		p4.setProductName("Cocacola");	p4.setProductID(879546);	p4.setProductPrice(50);	p4.setProductBrand("Pepsi");
		p5.setProductName("Laptop");	p5.setProductID(213546);	p5.setProductPrice(50000);	p5.setProductBrand("Dell");
		p6.setProductName("DishWash");	p6.setProductID(855296);	p6.setProductPrice(55);	p6.setProductBrand("Dettol");
		p7.setProductName("Toothpaste");	p7.setProductID(753159);	p7.setProductPrice(120);	p7.setProductBrand("Dabur");
		
		System.out.println("=======================================================================================");
		
		System.out.println("================ProductDTO Details 1====================");
		System.out.println("Object reference is: " +p1);
		System.out.println("ProductName is: " +p1.getProductName());
		System.out.println("ProductID is: " +p1.getProductID());
		System.out.println("ProductPrice is: " +p1.getProductPrice());
		System.out.println("ProductBrand is:" +p1.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 2====================");
		System.out.println("Object reference is: " +p2);
		System.out.println("ProductName is: " +p2.getProductName());
		System.out.println("ProductID is: " +p2.getProductID());
		System.out.println("ProductPrice is: " +p2.getProductPrice());
		System.out.println("ProductBrand is:" +p2.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 3====================");
		System.out.println("Object reference is: " +p3);
		System.out.println("ProductName is: " +p3.getProductName());
		System.out.println("ProductID is: " +p3.getProductID());
		System.out.println("ProductPrice is: " +p3.getProductPrice());
		System.out.println("ProductBrand is:" +p3.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 4====================");
		System.out.println("Object reference is: " +p4);
		System.out.println("ProductName is: " +p4.getProductName());
		System.out.println("ProductID is: " +p4.getProductID());
		System.out.println("ProductPrice is: " +p4.getProductPrice());
		System.out.println("ProductBrand is:" +p4.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 5====================");
		System.out.println("Object reference is: " +p5);
		System.out.println("ProductName is: " +p5.getProductName());
		System.out.println("ProductID is: " +p5.getProductID());
		System.out.println("ProductPrice is: " +p5.getProductPrice());
		System.out.println("ProductBrand is:" +p5.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 6====================");
		System.out.println("Object reference is: " +p6);
		System.out.println("ProductName is: " +p6.getProductName());
		System.out.println("ProductID is: " +p6.getProductID());
		System.out.println("ProductPrice is: " +p6.getProductPrice());
		System.out.println("ProductBrand is:" +p6.getProductBrand());
		System.out.println("==========================================");
		System.out.println("================ProductDTO Details 7====================");
		System.out.println("Object reference is: " +p7);
		System.out.println("ProductName is: " +p7.getProductName());
		System.out.println("ProductID is: " +p7.getProductID());
		System.out.println("ProductPrice is: " +p7.getProductPrice());
		System.out.println("ProductBrand is:" +p7.getProductBrand());
		System.out.println("==========================================");

	}

}
