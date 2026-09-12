package constructor.shallowCopy.Order;

public class Order {
	
	    String orderNumber;
	    String orderDate;
	    int totalAmount;
	    String paymentMode;
	    Customer c;
	    OrderDetails od;

	    Order() {
	    }

	    Order(String orderNumber, String orderDate, int totalAmount, String paymentMode, Customer c, OrderDetails od) {

	        this.orderNumber = orderNumber;
	        this.orderDate = orderDate;
	        this.totalAmount = totalAmount;
	        this.paymentMode = paymentMode;
	        this.c = c;
	        this.od = od;
	    }

	    // deep Copy Constructor
	    Order(Order o) {

	        this.orderNumber = o.orderNumber;
	        this.orderDate = o.orderDate;
	        this.totalAmount = o.totalAmount;
	        this.paymentMode = o.paymentMode;
	        this.c = new Customer();
	        this.c.age = o.c.age;
	        this.c.city = o.c.city;
	        this.c.customerId = o.c.customerId;
	        this.c.customerName = o.c.customerName;
	        this.c.customerType = o.c.customerType;
	        this.c.gender = o.c.gender;
	        this.od = new OrderDetails();
	        this.od.category = o.od.category;
	        this.od.deliveryStatus = o.od.deliveryStatus;
	        this.od.price = o.od.price;
	        this.od.productId = o.od.productId;
	        this.od.productName = o.od.productName;
	        this.od.quantity = o.od.quantity;
	    }

	    public String toString() {

	        return "OrderNumber is: " + orderNumber + "\nOrderDate is: " + orderDate + "\nTotalAmount is: " + totalAmount + "\nPaymentMode is: " + paymentMode + "\nCustomer is: " + c + "\nOrderDetails is: " + od + "\n========================";
	    }
	

}
