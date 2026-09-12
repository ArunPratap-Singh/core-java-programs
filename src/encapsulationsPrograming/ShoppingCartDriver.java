package encapsulationsPrograming;

public class ShoppingCartDriver {
	
	public static void main(String[] args) {
		
		System.out.println("=========================Main Method Starts=================================");
		
		ShoppingCart s1 = new ShoppingCart("Mohan Singh", "CART101", "Laptop", 2, 150000.00);
		ShoppingCart s2 = new ShoppingCart("Rohan Kumar", "CART102", "Mobile", 3, 90000.00);
		ShoppingCart s3 = new ShoppingCart("Sohan Sharma", "CART103", "Headphones", 4, 12000.00);
		ShoppingCart s4 = new ShoppingCart("Rahul Verma", "CART104", "Keyboard", 2, 5000.00);
		ShoppingCart s5 = new ShoppingCart("Shyam Gupta", "CART105", "Monitor", 1, 25000.00);
		ShoppingCart s6 = new ShoppingCart("Manoj Singh", "CART106", "Mouse", 5, 7500.00);
		ShoppingCart s7 = new ShoppingCart("Akash Kumar", "CART107", "Printer", 1, 18000.00);
		ShoppingCart s8 = new ShoppingCart("Samarth Singh", "CART108", "Tablet", 2, 60000.00);
		ShoppingCart s9 = new ShoppingCart("Abhishek Kumar", "CART109", "Smart Watch", 3, 15000.00);
		ShoppingCart s10 = new ShoppingCart("Karan Singh", "CART110", "Camera", 1, 55000.00);

		ShoppingCart s11 = new ShoppingCart("Amit Sharma", "CART111", "Laptop Bag", 2, 5000.00);
		ShoppingCart s12 = new ShoppingCart("Sumit Kumar", "CART112", "Power Bank", 4, 6000.00);
		ShoppingCart s13 = new ShoppingCart("Ravi Verma", "CART113", "Bluetooth Speaker", 2, 8000.00);
		ShoppingCart s14 = new ShoppingCart("Nitin Gupta", "CART114", "Webcam", 3, 9000.00);
		ShoppingCart s15 = new ShoppingCart("Varun Singh", "CART115", "USB Cable", 5, 2500.00);
		ShoppingCart s16 = new ShoppingCart("Ankit Kumar", "CART116", "External Hard Disk", 2, 14000.00);
		ShoppingCart s17 = new ShoppingCart("Deepak Sharma", "CART117", "SSD", 1, 8500.00);
		ShoppingCart s18 = new ShoppingCart("Pankaj Verma", "CART118", "RAM", 2, 7000.00);
		ShoppingCart s19 = new ShoppingCart("Sachin Gupta", "CART119", "Graphics Card", 1, 45000.00);
		ShoppingCart s20 = new ShoppingCart("Rakesh Singh", "CART120", "Motherboard", 1, 18000.00);

		ShoppingCart s21 = new ShoppingCart("Vivek Kumar", "CART121", "Processor", 1, 32000.00);
		ShoppingCart s22 = new ShoppingCart("Gaurav Sharma", "CART122", "Power Supply", 2, 9000.00);
		ShoppingCart s23 = new ShoppingCart("Harish Verma", "CART123", "Cabinet", 1, 7500.00);
		ShoppingCart s24 = new ShoppingCart("Suresh Kumar", "CART124", "Gaming Chair", 1, 22000.00);
		ShoppingCart s25 = new ShoppingCart("Mahesh Singh", "CART125", "Gaming Mouse", 2, 5000.00);
		ShoppingCart s26 = new ShoppingCart("Yash Gupta", "CART126", "Gaming Keyboard", 1, 6500.00);
		ShoppingCart s27 = new ShoppingCart("Ayush Sharma", "CART127", "Gaming Headset", 2, 7000.00);
		ShoppingCart s28 = new ShoppingCart("Kunal Kumar", "CART128", "Smart TV", 1, 55000.00);
		ShoppingCart s29 = new ShoppingCart("Rohit Verma", "CART129", "Refrigerator", 1, 48000.00);
		ShoppingCart s30 = new ShoppingCart("Mohit Gupta", "CART130", "Washing Machine", 1, 42000.00);

		ShoppingCart s31 = new ShoppingCart("Tarun Singh", "CART131", "Microwave Oven", 2, 18000.00);
		ShoppingCart s32 = new ShoppingCart("Arjun Kumar", "CART132", "Air Conditioner", 1, 52000.00);
		ShoppingCart s33 = new ShoppingCart("Naveen Sharma", "CART133", "Air Cooler", 2, 16000.00);
		ShoppingCart s34 = new ShoppingCart("Prakash Verma", "CART134", "Vacuum Cleaner", 1, 12000.00);
		ShoppingCart s35 = new ShoppingCart("Shubham Singh", "CART135", "Mixer Grinder", 2, 7000.00);
		ShoppingCart s36 = new ShoppingCart("Aditya Kumar", "CART136", "Coffee Maker", 1, 8500.00);
		ShoppingCart s37 = new ShoppingCart("Raj Sharma", "CART137", "Electric Kettle", 3, 4500.00);
		ShoppingCart s38 = new ShoppingCart("Vishal Verma", "CART138", "Induction Cooktop", 1, 5500.00);
		ShoppingCart s39 = new ShoppingCart("Dev Kumar", "CART139", "Iron", 2, 3000.00);
		ShoppingCart s40 = new ShoppingCart("Rajat Singh", "CART140", "Water Purifier", 1, 24000.00);

		ShoppingCart s41 = new ShoppingCart("Mukul Sharma", "CART141", "Backpack", 2, 5000.00);
		ShoppingCart s42 = new ShoppingCart("Ashish Kumar", "CART142", "Shoes", 2, 7000.00);
		ShoppingCart s43 = new ShoppingCart("Lokesh Verma", "CART143", "Wrist Watch", 1, 12000.00);
		ShoppingCart s44 = new ShoppingCart("Sanjay Gupta", "CART144", "Sunglasses", 3, 9000.00);
		ShoppingCart s45 = new ShoppingCart("Manish Singh", "CART145", "Jacket", 2, 8000.00);
		ShoppingCart s46 = new ShoppingCart("Rishabh Kumar", "CART146", "Jeans", 3, 7500.00);
		ShoppingCart s47 = new ShoppingCart("Shivam Sharma", "CART147", "Shirt", 4, 6000.00);
		ShoppingCart s48 = new ShoppingCart("Aman Verma", "CART148", "Trolley Bag", 1, 11000.00);
		ShoppingCart s49 = new ShoppingCart("Neeraj Gupta", "CART149", "Bluetooth Earbuds", 2, 10000.00);
		ShoppingCart s50 = new ShoppingCart("Varun Singh", "CART150", "Smartphone", 1, 78000.00);
		
		
		System.out.println("=========================ShoppingCart Details 1===========================");
		System.out.println("Object Reference is: " + s1);
		System.out.println("Customer Name is: " + s1.getCustomerName());
		System.out.println("Cart ID is: " + s1.getCartID());
		System.out.println("Product Name is: " + s1.getProductName());
		System.out.println("Product Quantity is: " + s1.getQuantity());
		System.out.println("Total Price is: " + s1.getTotalPrice());
		
		System.out.println("=========================ShoppingCart Details 2===========================");
		System.out.println("Object Reference is: " + s2);
		System.out.println("Customer Name is: " + s2.getCustomerName());
		System.out.println("Cart ID is: " + s2.getCartID());
		System.out.println("Product Name is: " + s2.getProductName());
		System.out.println("Product Quantity is: " + s2.getQuantity());
		System.out.println("Total Price is: " + s2.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 3===========================");
		System.out.println("Object Reference is: " + s3);
		System.out.println("Customer Name is: " + s3.getCustomerName());
		System.out.println("Cart ID is: " + s3.getCartID());
		System.out.println("Product Name is: " + s3.getProductName());
		System.out.println("Product Quantity is: " + s3.getQuantity());
		System.out.println("Total Price is: " + s3.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 4===========================");
		System.out.println("Object Reference is: " + s4);
		System.out.println("Customer Name is: " + s4.getCustomerName());
		System.out.println("Cart ID is: " + s4.getCartID());
		System.out.println("Product Name is: " + s4.getProductName());
		System.out.println("Product Quantity is: " + s4.getQuantity());
		System.out.println("Total Price is: " + s4.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 5===========================");
		System.out.println("Object Reference is: " + s5);
		System.out.println("Customer Name is: " + s5.getCustomerName());
		System.out.println("Cart ID is: " + s5.getCartID());
		System.out.println("Product Name is: " + s5.getProductName());
		System.out.println("Product Quantity is: " + s5.getQuantity());
		System.out.println("Total Price is: " + s5.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 6===========================");
		System.out.println("Object Reference is: " + s6);
		System.out.println("Customer Name is: " + s6.getCustomerName());
		System.out.println("Cart ID is: " + s6.getCartID());
		System.out.println("Product Name is: " + s6.getProductName());
		System.out.println("Product Quantity is: " + s6.getQuantity());
		System.out.println("Total Price is: " + s6.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 7===========================");
		System.out.println("Object Reference is: " + s7);
		System.out.println("Customer Name is: " + s7.getCustomerName());
		System.out.println("Cart ID is: " + s7.getCartID());
		System.out.println("Product Name is: " + s7.getProductName());
		System.out.println("Product Quantity is: " + s7.getQuantity());
		System.out.println("Total Price is: " + s7.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 8===========================");
		System.out.println("Object Reference is: " + s8);
		System.out.println("Customer Name is: " + s8.getCustomerName());
		System.out.println("Cart ID is: " + s8.getCartID());
		System.out.println("Product Name is: " + s8.getProductName());
		System.out.println("Product Quantity is: " + s8.getQuantity());
		System.out.println("Total Price is: " + s8.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 9===========================");
		System.out.println("Object Reference is: " + s9);
		System.out.println("Customer Name is: " + s9.getCustomerName());
		System.out.println("Cart ID is: " + s9.getCartID());
		System.out.println("Product Name is: " + s9.getProductName());
		System.out.println("Product Quantity is: " + s9.getQuantity());
		System.out.println("Total Price is: " + s9.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 10===========================");
		System.out.println("Object Reference is: " + s10);
		System.out.println("Customer Name is: " + s10.getCustomerName());
		System.out.println("Cart ID is: " + s10.getCartID());
		System.out.println("Product Name is: " + s10.getProductName());
		System.out.println("Product Quantity is: " + s10.getQuantity());
		System.out.println("Total Price is: " + s10.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 11===========================");
		System.out.println("Object Reference is: " + s11);
		System.out.println("Customer Name is: " + s11.getCustomerName());
		System.out.println("Cart ID is: " + s11.getCartID());
		System.out.println("Product Name is: " + s11.getProductName());
		System.out.println("Product Quantity is: " + s11.getQuantity());
		System.out.println("Total Price is: " + s11.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 12===========================");
		System.out.println("Object Reference is: " + s12);
		System.out.println("Customer Name is: " + s12.getCustomerName());
		System.out.println("Cart ID is: " + s12.getCartID());
		System.out.println("Product Name is: " + s12.getProductName());
		System.out.println("Product Quantity is: " + s12.getQuantity());
		System.out.println("Total Price is: " + s12.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 13===========================");
		System.out.println("Object Reference is: " + s13);
		System.out.println("Customer Name is: " + s13.getCustomerName());
		System.out.println("Cart ID is: " + s13.getCartID());
		System.out.println("Product Name is: " + s13.getProductName());
		System.out.println("Product Quantity is: " + s13.getQuantity());
		System.out.println("Total Price is: " + s13.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 14===========================");
		System.out.println("Object Reference is: " + s14);
		System.out.println("Customer Name is: " + s14.getCustomerName());
		System.out.println("Cart ID is: " + s14.getCartID());
		System.out.println("Product Name is: " + s14.getProductName());
		System.out.println("Product Quantity is: " + s14.getQuantity());
		System.out.println("Total Price is: " + s14.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 15===========================");
		System.out.println("Object Reference is: " + s15);
		System.out.println("Customer Name is: " + s15.getCustomerName());
		System.out.println("Cart ID is: " + s15.getCartID());
		System.out.println("Product Name is: " + s15.getProductName());
		System.out.println("Product Quantity is: " + s15.getQuantity());
		System.out.println("Total Price is: " + s15.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 16===========================");
		System.out.println("Object Reference is: " + s16);
		System.out.println("Customer Name is: " + s16.getCustomerName());
		System.out.println("Cart ID is: " + s16.getCartID());
		System.out.println("Product Name is: " + s16.getProductName());
		System.out.println("Product Quantity is: " + s16.getQuantity());
		System.out.println("Total Price is: " + s16.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 17===========================");
		System.out.println("Object Reference is: " + s17);
		System.out.println("Customer Name is: " + s17.getCustomerName());
		System.out.println("Cart ID is: " + s17.getCartID());
		System.out.println("Product Name is: " + s17.getProductName());
		System.out.println("Product Quantity is: " + s17.getQuantity());
		System.out.println("Total Price is: " + s17.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 18===========================");
		System.out.println("Object Reference is: " + s18);
		System.out.println("Customer Name is: " + s18.getCustomerName());
		System.out.println("Cart ID is: " + s18.getCartID());
		System.out.println("Product Name is: " + s18.getProductName());
		System.out.println("Product Quantity is: " + s18.getQuantity());
		System.out.println("Total Price is: " + s18.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 19===========================");
		System.out.println("Object Reference is: " + s19);
		System.out.println("Customer Name is: " + s19.getCustomerName());
		System.out.println("Cart ID is: " + s19.getCartID());
		System.out.println("Product Name is: " + s19.getProductName());
		System.out.println("Product Quantity is: " + s19.getQuantity());
		System.out.println("Total Price is: " + s19.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 20===========================");
		System.out.println("Object Reference is: " + s20);
		System.out.println("Customer Name is: " + s20.getCustomerName());
		System.out.println("Cart ID is: " + s20.getCartID());
		System.out.println("Product Name is: " + s20.getProductName());
		System.out.println("Product Quantity is: " + s20.getQuantity());
		System.out.println("Total Price is: " + s20.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 21===========================");
		System.out.println("Object Reference is: " + s21);
		System.out.println("Customer Name is: " + s21.getCustomerName());
		System.out.println("Cart ID is: " + s21.getCartID());
		System.out.println("Product Name is: " + s21.getProductName());
		System.out.println("Product Quantity is: " + s21.getQuantity());
		System.out.println("Total Price is: " + s21.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 22===========================");
		System.out.println("Object Reference is: " + s22);
		System.out.println("Customer Name is: " + s22.getCustomerName());
		System.out.println("Cart ID is: " + s22.getCartID());
		System.out.println("Product Name is: " + s22.getProductName());
		System.out.println("Product Quantity is: " + s22.getQuantity());
		System.out.println("Total Price is: " + s22.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 23===========================");
		System.out.println("Object Reference is: " + s23);
		System.out.println("Customer Name is: " + s23.getCustomerName());
		System.out.println("Cart ID is: " + s23.getCartID());
		System.out.println("Product Name is: " + s23.getProductName());
		System.out.println("Product Quantity is: " + s23.getQuantity());
		System.out.println("Total Price is: " + s23.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 24===========================");
		System.out.println("Object Reference is: " + s24);
		System.out.println("Customer Name is: " + s24.getCustomerName());
		System.out.println("Cart ID is: " + s24.getCartID());
		System.out.println("Product Name is: " + s24.getProductName());
		System.out.println("Product Quantity is: " + s24.getQuantity());
		System.out.println("Total Price is: " + s24.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 25===========================");
		System.out.println("Object Reference is: " + s25);
		System.out.println("Customer Name is: " + s25.getCustomerName());
		System.out.println("Cart ID is: " + s25.getCartID());
		System.out.println("Product Name is: " + s25.getProductName());
		System.out.println("Product Quantity is: " + s25.getQuantity());
		System.out.println("Total Price is: " + s25.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 26===========================");
		System.out.println("Object Reference is: " + s26);
		System.out.println("Customer Name is: " + s26.getCustomerName());
		System.out.println("Cart ID is: " + s26.getCartID());
		System.out.println("Product Name is: " + s26.getProductName());
		System.out.println("Product Quantity is: " + s26.getQuantity());
		System.out.println("Total Price is: " + s26.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 27===========================");
		System.out.println("Object Reference is: " + s27);
		System.out.println("Customer Name is: " + s27.getCustomerName());
		System.out.println("Cart ID is: " + s27.getCartID());
		System.out.println("Product Name is: " + s27.getProductName());
		System.out.println("Product Quantity is: " + s27.getQuantity());
		System.out.println("Total Price is: " + s27.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 28===========================");
		System.out.println("Object Reference is: " + s28);
		System.out.println("Customer Name is: " + s28.getCustomerName());
		System.out.println("Cart ID is: " + s28.getCartID());
		System.out.println("Product Name is: " + s28.getProductName());
		System.out.println("Product Quantity is: " + s28.getQuantity());
		System.out.println("Total Price is: " + s28.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 29===========================");
		System.out.println("Object Reference is: " + s29);
		System.out.println("Customer Name is: " + s29.getCustomerName());
		System.out.println("Cart ID is: " + s29.getCartID());
		System.out.println("Product Name is: " + s29.getProductName());
		System.out.println("Product Quantity is: " + s29.getQuantity());
		System.out.println("Total Price is: " + s29.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 30===========================");
		System.out.println("Object Reference is: " + s30);
		System.out.println("Customer Name is: " + s30.getCustomerName());
		System.out.println("Cart ID is: " + s30.getCartID());
		System.out.println("Product Name is: " + s30.getProductName());
		System.out.println("Product Quantity is: " + s30.getQuantity());
		System.out.println("Total Price is: " + s30.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 31===========================");
		System.out.println("Object Reference is: " + s31);
		System.out.println("Customer Name is: " + s31.getCustomerName());
		System.out.println("Cart ID is: " + s31.getCartID());
		System.out.println("Product Name is: " + s31.getProductName());
		System.out.println("Product Quantity is: " + s31.getQuantity());
		System.out.println("Total Price is: " + s31.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 32===========================");
		System.out.println("Object Reference is: " + s32);
		System.out.println("Customer Name is: " + s32.getCustomerName());
		System.out.println("Cart ID is: " + s32.getCartID());
		System.out.println("Product Name is: " + s32.getProductName());
		System.out.println("Product Quantity is: " + s32.getQuantity());
		System.out.println("Total Price is: " + s32.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 33===========================");
		System.out.println("Object Reference is: " + s33);
		System.out.println("Customer Name is: " + s33.getCustomerName());
		System.out.println("Cart ID is: " + s33.getCartID());
		System.out.println("Product Name is: " + s33.getProductName());
		System.out.println("Product Quantity is: " + s33.getQuantity());
		System.out.println("Total Price is: " + s33.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 34===========================");
		System.out.println("Object Reference is: " + s34);
		System.out.println("Customer Name is: " + s34.getCustomerName());
		System.out.println("Cart ID is: " + s34.getCartID());
		System.out.println("Product Name is: " + s34.getProductName());
		System.out.println("Product Quantity is: " + s34.getQuantity());
		System.out.println("Total Price is: " + s34.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 35===========================");
		System.out.println("Object Reference is: " + s35);
		System.out.println("Customer Name is: " + s35.getCustomerName());
		System.out.println("Cart ID is: " + s35.getCartID());
		System.out.println("Product Name is: " + s35.getProductName());
		System.out.println("Product Quantity is: " + s35.getQuantity());
		System.out.println("Total Price is: " + s35.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 36===========================");
		System.out.println("Object Reference is: " + s36);
		System.out.println("Customer Name is: " + s36.getCustomerName());
		System.out.println("Cart ID is: " + s36.getCartID());
		System.out.println("Product Name is: " + s36.getProductName());
		System.out.println("Product Quantity is: " + s36.getQuantity());
		System.out.println("Total Price is: " + s36.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 37===========================");
		System.out.println("Object Reference is: " + s37);
		System.out.println("Customer Name is: " + s37.getCustomerName());
		System.out.println("Cart ID is: " + s37.getCartID());
		System.out.println("Product Name is: " + s37.getProductName());
		System.out.println("Product Quantity is: " + s37.getQuantity());
		System.out.println("Total Price is: " + s37.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 38===========================");
		System.out.println("Object Reference is: " + s38);
		System.out.println("Customer Name is: " + s38.getCustomerName());
		System.out.println("Cart ID is: " + s38.getCartID());
		System.out.println("Product Name is: " + s38.getProductName());
		System.out.println("Product Quantity is: " + s38.getQuantity());
		System.out.println("Total Price is: " + s38.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 39===========================");
		System.out.println("Object Reference is: " + s39);
		System.out.println("Customer Name is: " + s39.getCustomerName());
		System.out.println("Cart ID is: " + s39.getCartID());
		System.out.println("Product Name is: " + s39.getProductName());
		System.out.println("Product Quantity is: " + s39.getQuantity());
		System.out.println("Total Price is: " + s39.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 40===========================");
		System.out.println("Object Reference is: " + s40);
		System.out.println("Customer Name is: " + s40.getCustomerName());
		System.out.println("Cart ID is: " + s40.getCartID());
		System.out.println("Product Name is: " + s40.getProductName());
		System.out.println("Product Quantity is: " + s40.getQuantity());
		System.out.println("Total Price is: " + s40.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 41===========================");
		System.out.println("Object Reference is: " + s41);
		System.out.println("Customer Name is: " + s41.getCustomerName());
		System.out.println("Cart ID is: " + s41.getCartID());
		System.out.println("Product Name is: " + s41.getProductName());
		System.out.println("Product Quantity is: " + s41.getQuantity());
		System.out.println("Total Price is: " + s41.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 42===========================");
		System.out.println("Object Reference is: " + s42);
		System.out.println("Customer Name is: " + s42.getCustomerName());
		System.out.println("Cart ID is: " + s42.getCartID());
		System.out.println("Product Name is: " + s42.getProductName());
		System.out.println("Product Quantity is: " + s42.getQuantity());
		System.out.println("Total Price is: " + s42.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 43===========================");
		System.out.println("Object Reference is: " + s43);
		System.out.println("Customer Name is: " + s43.getCustomerName());
		System.out.println("Cart ID is: " + s43.getCartID());
		System.out.println("Product Name is: " + s43.getProductName());
		System.out.println("Product Quantity is: " + s43.getQuantity());
		System.out.println("Total Price is: " + s43.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 44===========================");
		System.out.println("Object Reference is: " + s44);
		System.out.println("Customer Name is: " + s44.getCustomerName());
		System.out.println("Cart ID is: " + s44.getCartID());
		System.out.println("Product Name is: " + s44.getProductName());
		System.out.println("Product Quantity is: " + s44.getQuantity());
		System.out.println("Total Price is: " + s44.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 45===========================");
		System.out.println("Object Reference is: " + s45);
		System.out.println("Customer Name is: " + s45.getCustomerName());
		System.out.println("Cart ID is: " + s45.getCartID());
		System.out.println("Product Name is: " + s45.getProductName());
		System.out.println("Product Quantity is: " + s45.getQuantity());
		System.out.println("Total Price is: " + s45.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 46===========================");
		System.out.println("Object Reference is: " + s46);
		System.out.println("Customer Name is: " + s46.getCustomerName());
		System.out.println("Cart ID is: " + s46.getCartID());
		System.out.println("Product Name is: " + s46.getProductName());
		System.out.println("Product Quantity is: " + s46.getQuantity());
		System.out.println("Total Price is: " + s46.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 47===========================");
		System.out.println("Object Reference is: " + s47);
		System.out.println("Customer Name is: " + s47.getCustomerName());
		System.out.println("Cart ID is: " + s47.getCartID());
		System.out.println("Product Name is: " + s47.getProductName());
		System.out.println("Product Quantity is: " + s47.getQuantity());
		System.out.println("Total Price is: " + s47.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 48===========================");
		System.out.println("Object Reference is: " + s48);
		System.out.println("Customer Name is: " + s48.getCustomerName());
		System.out.println("Cart ID is: " + s48.getCartID());
		System.out.println("Product Name is: " + s48.getProductName());
		System.out.println("Product Quantity is: " + s48.getQuantity());
		System.out.println("Total Price is: " + s48.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 49===========================");
		System.out.println("Object Reference is: " + s49);
		System.out.println("Customer Name is: " + s49.getCustomerName());
		System.out.println("Cart ID is: " + s49.getCartID());
		System.out.println("Product Name is: " + s49.getProductName());
		System.out.println("Product Quantity is: " + s49.getQuantity());
		System.out.println("Total Price is: " + s49.getTotalPrice());

		System.out.println("=========================ShoppingCart Details 50===========================");
		System.out.println("Object Reference is: " + s50);
		System.out.println("Customer Name is: " + s50.getCustomerName());
		System.out.println("Cart ID is: " + s50.getCartID());
		System.out.println("Product Name is: " + s50.getProductName());
		System.out.println("Product Quantity is: " + s50.getQuantity());
		System.out.println("Total Price is: " + s50.getTotalPrice());
		
		System.out.println("==================================Main Method Ends=====================================");
	}
	
	
}
