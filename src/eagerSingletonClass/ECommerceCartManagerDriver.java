package eagerSingletonClass;

public class ECommerceCartManagerDriver {


		    public static void main(String[] args) {

		        System.out.println("========== E-COMMERCE CART MANAGEMENT ==========");

		        ECommerceCartManager c1 = ECommerceCartManager.getInstance();
		        ECommerceCartManager c2 = ECommerceCartManager.getInstance();
		        ECommerceCartManager c3 = ECommerceCartManager.getInstance();
		        
		        c1.CartInfo();
		        System.out.println("========");
		        c2.CartInfo();
		        System.out.println("========");
		        c3.CartInfo();

		        c1.setCustomerName("Akash");
		        c1.setTotalItems(200);
		        c1.setTotalAmount(200000);
		        System.out.println("==========");
		        

		        c1.addProduct("Laptop", 65000);
		        c1.addProduct("Mouse", 12000);
		        c1.addProduct("Keyboard", 250);
		        System.out.println("===============");
		        c2.addProduct("Mobile", 550000);
		        c2.addProduct("Printer", 120000);
		        c2.addProduct("LAN", 250);
		        c2.addProduct("MacBook", 2500000);
		        System.out.println("===============");
		        c3.addProduct("Shirt", 5500);
		        c3.addProduct("Jeans", 2200);
		        c3.addProduct("Shoes", 2900);

		        System.out.println("======================");
		        
		        c1.applyDiscount(10);
		        c2.applyDiscount(20);
		        c3.applyDiscount(30);
		        
		        System.out.println("==============After Change or Updates===============");
		        
		        c1.CartInfo();
		        
		        System.out.println("===========================");
		        
		        System.out.println(c1);
		        System.out.println(c2);
		        System.out.println(c3);
		        
		        System.out.println("===============================");

		        System.out.println("c1 == c2 : " + (c1 == c2));
		        System.out.println("c2 == c3 : " + (c2 == c3));
		        System.out.println("c1 == c3 : " + (c1 == c3));

		        //Remove Product
		        c2.removeProduct("Mouse", 12000);

		        // Check cart after removing
		        c3.CartInfo();
		    
		

	}

}
