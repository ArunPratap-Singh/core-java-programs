package abstraction.ElectricityBill;

public abstract class ElectricityBill {

	int billId;
	String customerName;
	String connectionNumber;
	String connectionType;
	String address;
	String city;
	String state;
	String meterNumber;
	int unitsConsumed;
	String billingMonth;
	String dueDate;

	ElectricityBill() {

	}

	ElectricityBill(int billId, String customerName, String connectionNumber, String connectionType, String address,
			String city, String state, String meterNumber, int unitsConsumed, String billingMonth, String dueDate) {

		this.billId = billId;
		this.customerName = customerName;
		this.connectionNumber = connectionNumber;
		this.connectionType = connectionType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.meterNumber = meterNumber;
		this.unitsConsumed = unitsConsumed;
		this.billingMonth = billingMonth;
		this.dueDate = dueDate;
	}

	public abstract double calculateBill();

	
	public void displayBillAmount() {
		System.out.println("Total Bill Amount  : " + calculateBill());
	}

	@Override
	public String toString() {
		return "ElectricityBill{" + "billId=" + billId + ", customerName='" + customerName + '\''
				+ ", connectionNumber='" + connectionNumber + '\'' + ", connectionType='" + connectionType + '\''
				+ ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
				+ ", meterNumber='" + meterNumber + '\'' + ", unitsConsumed=" + unitsConsumed + ", billingMonth='"
				+ billingMonth + '\'' + ", dueDate='" + dueDate + '\'' + '}';
	}
}