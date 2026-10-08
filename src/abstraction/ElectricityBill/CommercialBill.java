package abstraction.ElectricityBill;

public class CommercialBill extends ElectricityBill {

	double demandCharge;
	double fixedCharge;
	double taxPercentage;
	double latePaymentCharge;
	double powerFactor;
	boolean highTensionConnection;
	boolean industrialConnection;

	CommercialBill() {

	}

	CommercialBill(int billId, String customerName, String connectionNumber, String connectionType,
			String address, String city, String state, String meterNumber, int unitsConsumed, String billingMonth,
			String dueDate, double demandCharge, double fixedCharge, double taxPercentage, double latePaymentCharge,
			double powerFactor, boolean highTensionConnection, boolean industrialConnection) {

		super(billId, customerName, connectionNumber, connectionType, address, city, state, meterNumber, unitsConsumed,
				billingMonth, dueDate);

		this.demandCharge = demandCharge;
		this.fixedCharge = fixedCharge;
		this.taxPercentage = taxPercentage;
		this.latePaymentCharge = latePaymentCharge;
		this.powerFactor = powerFactor;
		this.highTensionConnection = highTensionConnection;
		this.industrialConnection = industrialConnection;
	}

	@Override
	public double calculateBill() {

		double energyCharge = unitsConsumed * 9.0;

		double powerFactorAdjustment = 0.0;

		if (powerFactor < 0.90) {
			powerFactorAdjustment = energyCharge * 0.05;
		}

		double subtotal = energyCharge + demandCharge + fixedCharge + powerFactorAdjustment;

		double tax = subtotal * taxPercentage / 100;

		return subtotal + tax + latePaymentCharge;
	}

	
	@Override
	public String toString() {
		return "CommercialBill{" + "billId=" + billId + ", customerName='" + customerName + '\'' + ", unitsConsumed="
				+ unitsConsumed + ", demandCharge=" + demandCharge + ", fixedCharge=" + fixedCharge + ", taxPercentage="
				+ taxPercentage + ", latePaymentCharge=" + latePaymentCharge + ", powerFactor=" + powerFactor
				+ ", highTensionConnection=" + highTensionConnection + ", industrialConnection=" + industrialConnection
				+ ", totalBill=" + calculateBill() + '}';
	}
}
