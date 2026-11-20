package builderPattern;

public class ShoppingCartDriver {

	public static void main(String[] args) {

        ShoppingCart sc1 = new ShoppingCart.Builder().setCustomerName("Arun").setProductName("Laptop").setQuantity(1).setPrice(55000).setTotalAmount(55000).setPaymentMode("UPI").build();

        ShoppingCart sc2 = new ShoppingCart.Builder().setCustomerName("Rahul").setProductName("Mobile").setQuantity(2).setPrice(20000).setTotalAmount(40000).setPaymentMode("Credit Card").build();

        ShoppingCart sc3 = new ShoppingCart.Builder().setCustomerName("Amit").setProductName("Headphones").setQuantity(3).setPrice(1500).setTotalAmount(4500).setPaymentMode("Debit Card").build();

        ShoppingCart sc4 = new ShoppingCart.Builder().setCustomerName("Priya").setProductName("Smart Watch").setQuantity(1).setPrice(5000).setTotalAmount(5000).setPaymentMode("UPI").build();

        ShoppingCart sc5 = new ShoppingCart.Builder().setCustomerName("Neha").setProductName("Keyboard").setQuantity(2).setPrice(1200).setTotalAmount(2400).setPaymentMode("Cash").build();

        ShoppingCart sc6 = new ShoppingCart.Builder().setCustomerName("Rohit").setProductName("Mouse").setQuantity(4).setPrice(500).setTotalAmount(2000).setPaymentMode("UPI").build();

        ShoppingCart sc7 = new ShoppingCart.Builder().setCustomerName("Sneha").setProductName("Monitor").setQuantity(1).setPrice(12000).setTotalAmount(12000).setPaymentMode("Credit Card").build();

        ShoppingCart sc8 = new ShoppingCart.Builder().setCustomerName("Vikas").setProductName("Printer").setQuantity(1).setPrice(8500).setTotalAmount(8500).setPaymentMode("Debit Card").build();

        ShoppingCart sc9 = new ShoppingCart.Builder().setCustomerName("Anjali").setProductName("Tablet").setQuantity(2).setPrice(18000).setTotalAmount(36000).setPaymentMode("UPI").build();

        ShoppingCart sc10 = new ShoppingCart.Builder().setCustomerName("Karan").setProductName("Speaker").setQuantity(2).setPrice(2500).setTotalAmount(5000).setPaymentMode("Cash").build();

        ShoppingCart sc11 = new ShoppingCart.Builder().setCustomerName("Pooja").setProductName("Camera").setQuantity(1).setPrice(35000).setTotalAmount(35000).setPaymentMode("Credit Card").build();

        ShoppingCart sc12 = new ShoppingCart.Builder().setCustomerName("Suresh").setProductName("Power Bank").setQuantity(3).setPrice(1200).setTotalAmount(3600).setPaymentMode("UPI").build();

        ShoppingCart sc13 = new ShoppingCart.Builder().setCustomerName("Kavita").setProductName("USB Cable").setQuantity(5).setPrice(300).setTotalAmount(1500).setPaymentMode("Cash").build();

        ShoppingCart sc14 = new ShoppingCart.Builder().setCustomerName("Manish").setProductName("External Hard Drive").setQuantity(1).setPrice(6000).setTotalAmount(6000).setPaymentMode("Debit Card").build();

        ShoppingCart sc15 = new ShoppingCart.Builder().setCustomerName("Riya").setProductName("Gaming Chair").setQuantity(1).setPrice(15000).setTotalAmount(15000).setPaymentMode("Credit Card").build();

        ShoppingCart sc16 = new ShoppingCart.Builder().setCustomerName("Deepak").setProductName("Webcam").setQuantity(2).setPrice(2500).setTotalAmount(5000).setPaymentMode("UPI").build();

        ShoppingCart sc17 = new ShoppingCart.Builder().setCustomerName("Nisha").setProductName("Bluetooth Earbuds").setQuantity(1).setPrice(3000).setTotalAmount(3000).setPaymentMode("Debit Card").build();

        ShoppingCart sc18 = new ShoppingCart.Builder().setCustomerName("Ajay").setProductName("Refrigerator").setQuantity(1).setPrice(28000).setTotalAmount(28000).setPaymentMode("Credit Card").build();

        ShoppingCart sc19 = new ShoppingCart.Builder().setCustomerName("Simran").setProductName("Washing Machine").setQuantity(1).setPrice(22000).setTotalAmount(22000).setPaymentMode("UPI").build();

        ShoppingCart sc20 = new ShoppingCart.Builder().setCustomerName("Varun").setProductName("Air Conditioner").setQuantity(1).setPrice(38000).setTotalAmount(38000).setPaymentMode("Debit Card").build();

        System.out.println(sc1);
        System.out.println("====================");

        System.out.println(sc2);
        System.out.println("====================");

        System.out.println(sc3);
        System.out.println("====================");

        System.out.println(sc4);
        System.out.println("====================");

        System.out.println(sc5);
        System.out.println("====================");

        System.out.println(sc6);
        System.out.println("====================");

        System.out.println(sc7);
        System.out.println("====================");

        System.out.println(sc8);
        System.out.println("====================");

        System.out.println(sc9);
        System.out.println("====================");

        System.out.println(sc10);
        System.out.println("====================");

        System.out.println(sc11);
        System.out.println("====================");

        System.out.println(sc12);
        System.out.println("====================");

        System.out.println(sc13);
        System.out.println("====================");

        System.out.println(sc14);
        System.out.println("====================");

        System.out.println(sc15);
        System.out.println("====================");

        System.out.println(sc16);
        System.out.println("====================");

        System.out.println(sc17);
        System.out.println("====================");

        System.out.println(sc18);
        System.out.println("====================");

        System.out.println(sc19);
        System.out.println("====================");

        System.out.println(sc20);
	  }
}


