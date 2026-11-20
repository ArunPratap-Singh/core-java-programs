package builderPattern;

public class OnlineOrderDriver {
	
    public static void main(String[] args) {

        OnlineOrder o1 = new OnlineOrder.Builder().setOrderId(101).setCustomerName("Arun").setProductName("Laptop").setQuantity(1).setPrice(55000).setTotalAmount(55000).setPaymentMode("UPI").setDeliveryAddress("Lucknow").build();

        OnlineOrder o2 = new OnlineOrder.Builder().setOrderId(102).setCustomerName("Rahul").setProductName("Mobile").setQuantity(2).setPrice(20000).setTotalAmount(40000).setPaymentMode("Credit Card").setDeliveryAddress("Delhi").build();

        OnlineOrder o3 = new OnlineOrder.Builder().setOrderId(103).setCustomerName("Amit").setProductName("Headphones").setQuantity(3).setPrice(1500).setTotalAmount(4500).setPaymentMode("Debit Card").setDeliveryAddress("Noida").build();

        OnlineOrder o4 = new OnlineOrder.Builder().setOrderId(104).setCustomerName("Priya").setProductName("Smart Watch").setQuantity(1).setPrice(5000).setTotalAmount(5000).setPaymentMode("UPI").setDeliveryAddress("Mumbai").build();

        OnlineOrder o5 = new OnlineOrder.Builder().setOrderId(105).setCustomerName("Neha").setProductName("Keyboard").setQuantity(2).setPrice(1200).setTotalAmount(2400).setPaymentMode("Cash").setDeliveryAddress("Pune").build();

        OnlineOrder o6 = new OnlineOrder.Builder().setOrderId(106).setCustomerName("Rohit").setProductName("Mouse").setQuantity(4).setPrice(500).setTotalAmount(2000).setPaymentMode("UPI").setDeliveryAddress("Jaipur").build();

        OnlineOrder o7 = new OnlineOrder.Builder().setOrderId(107).setCustomerName("Sneha").setProductName("Monitor").setQuantity(1).setPrice(12000).setTotalAmount(12000).setPaymentMode("Credit Card").setDeliveryAddress("Bangalore").build();

        OnlineOrder o8 = new OnlineOrder.Builder().setOrderId(108).setCustomerName("Vikas").setProductName("Printer").setQuantity(1).setPrice(8500).setTotalAmount(8500).setPaymentMode("Debit Card").setDeliveryAddress("Chennai").build();

        OnlineOrder o9 = new OnlineOrder.Builder().setOrderId(109).setCustomerName("Anjali").setProductName("Tablet").setQuantity(2).setPrice(18000).setTotalAmount(36000).setPaymentMode("UPI").setDeliveryAddress("Hyderabad").build();

        OnlineOrder o10 = new OnlineOrder.Builder().setOrderId(110).setCustomerName("Karan").setProductName("Speaker").setQuantity(2).setPrice(2500).setTotalAmount(5000).setPaymentMode("Cash").setDeliveryAddress("Kolkata").build();

        OnlineOrder o11 = new OnlineOrder.Builder().setOrderId(111).setCustomerName("Pooja").setProductName("Camera").setQuantity(1).setPrice(35000).setTotalAmount(35000).setPaymentMode("Credit Card").setDeliveryAddress("Agra").build();

        OnlineOrder o12 = new OnlineOrder.Builder().setOrderId(112).setCustomerName("Suresh").setProductName("Power Bank").setQuantity(3).setPrice(1200).setTotalAmount(3600).setPaymentMode("UPI").setDeliveryAddress("Kanpur").build();

        OnlineOrder o13 = new OnlineOrder.Builder().setOrderId(113).setCustomerName("Kavita").setProductName("USB Cable").setQuantity(5).setPrice(300).setTotalAmount(1500).setPaymentMode("Cash").setDeliveryAddress("Prayagraj").build();

        OnlineOrder o14 = new OnlineOrder.Builder().setOrderId(114).setCustomerName("Manish").setProductName("Hard Drive").setQuantity(1).setPrice(6000).setTotalAmount(6000).setPaymentMode("Debit Card").setDeliveryAddress("Varanasi").build();

        OnlineOrder o15 = new OnlineOrder.Builder().setOrderId(115).setCustomerName("Riya").setProductName("Gaming Chair").setQuantity(1).setPrice(15000).setTotalAmount(15000).setPaymentMode("Credit Card").setDeliveryAddress("Gurgaon").build();

        OnlineOrder o16 = new OnlineOrder.Builder().setOrderId(116).setCustomerName("Deepak").setProductName("Webcam").setQuantity(2).setPrice(2500).setTotalAmount(5000).setPaymentMode("UPI").setDeliveryAddress("Indore").build();

        OnlineOrder o17 = new OnlineOrder.Builder().setOrderId(117).setCustomerName("Nisha").setProductName("Bluetooth Earbuds").setQuantity(1).setPrice(3000).setTotalAmount(3000).setPaymentMode("Debit Card").setDeliveryAddress("Bhopal").build();

        OnlineOrder o18 = new OnlineOrder.Builder().setOrderId(118).setCustomerName("Ajay").setProductName("Refrigerator").setQuantity(1).setPrice(28000).setTotalAmount(28000).setPaymentMode("Credit Card").setDeliveryAddress("Patna").build();

        OnlineOrder o19 = new OnlineOrder.Builder().setOrderId(119).setCustomerName("Simran").setProductName("Washing Machine").setQuantity(1).setPrice(22000).setTotalAmount(22000).setPaymentMode("UPI").setDeliveryAddress("Dehradun").build();

        OnlineOrder o20 = new OnlineOrder.Builder().setOrderId(120).setCustomerName("Varun").setProductName("Air Conditioner").setQuantity(1).setPrice(38000).setTotalAmount(38000).setPaymentMode("Debit Card").setDeliveryAddress("Gurugram").build();

        System.out.println(o1);
        System.out.println("====================");

        System.out.println(o2);
        System.out.println("====================");

        System.out.println(o3);
        System.out.println("====================");

        System.out.println(o4);
        System.out.println("====================");

        System.out.println(o5);
        System.out.println("====================");

        System.out.println(o6);
        System.out.println("====================");

        System.out.println(o7);
        System.out.println("====================");

        System.out.println(o8);
        System.out.println("====================");

        System.out.println(o9);
        System.out.println("====================");

        System.out.println(o10);
        System.out.println("====================");

        System.out.println(o11);
        System.out.println("====================");

        System.out.println(o12);
        System.out.println("====================");

        System.out.println(o13);
        System.out.println("====================");

        System.out.println(o14);
        System.out.println("====================");

        System.out.println(o15);
        System.out.println("====================");

        System.out.println(o16);
        System.out.println("====================");

        System.out.println(o17);
        System.out.println("====================");

        System.out.println(o18);
        System.out.println("====================");

        System.out.println(o19);
        System.out.println("====================");

        System.out.println(o20);
	    }
	}


