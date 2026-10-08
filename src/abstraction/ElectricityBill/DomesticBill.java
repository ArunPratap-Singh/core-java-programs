package abstraction.ElectricityBill;

public class DomesticBill extends ElectricityBill {

	double fixedCharge;
	double taxPercentage;
	double subsidy;
	double latePaymentCharge;
	boolean smartMeter;
	boolean solarConnection;

	DomesticBill() {

	}

	DomesticBill(int billId, String customerName, String connectionNumber, String connectionType, String address,
			String city, String state, String meterNumber, int unitsConsumed, String billingMonth, String dueDate,
			double fixedCharge, double taxPercentage, double subsidy, double latePaymentCharge, boolean smartMeter,
			boolean solarConnection) {

		super(billId, customerName, connectionNumber, connectionType, address, city, state, meterNumber, unitsConsumed,
				billingMonth, dueDate);

		this.fixedCharge = fixedCharge;
		this.taxPercentage = taxPercentage;
		this.subsidy = subsidy;
		this.latePaymentCharge = latePaymentCharge;
		this.smartMeter = smartMeter;
		this.solarConnection = solarConnection;
	}

	@Override
	public double calculateBill() {

		double energyCharge;

		if (unitsConsumed <= 100) {
			energyCharge = unitsConsumed * 3.0;
		} else if (unitsConsumed <= 200) {
			energyCharge = (100 * 3.0) + ((unitsConsumed - 100) * 4.5);
		} else if (unitsConsumed <= 400) {
			energyCharge = (100 * 3.0) + (100 * 4.5) + ((unitsConsumed - 200) * 6.0);
		} else {
			energyCharge = (100 * 3.0) + (100 * 4.5) + (200 * 6.0) + ((unitsConsumed - 400) * 7.5);
		}

		double subtotal = energyCharge + fixedCharge;

		double tax = subtotal * taxPercentage / 100;

		double total = subtotal + tax + latePaymentCharge - subsidy;

		return total;
	}

	@Override
	public String toString() {
		return "DomesticBill{" + "billId=" + billId + ", customerName='" + customerName + '\'' + ", unitsConsumed="
				+ unitsConsumed + ", fixedCharge=" + fixedCharge + ", taxPercentage=" + taxPercentage + ", subsidy="
				+ subsidy + ", latePaymentCharge=" + latePaymentCharge + ", smartMeter=" + smartMeter
				+ ", solarConnection=" + solarConnection + ", totalBill=" + calculateBill() + '}';
	}
}
