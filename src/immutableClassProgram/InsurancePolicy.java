package immutableClassProgram;

public final class InsurancePolicy {

	private final int policyId;
	private final String policyHolderName;
	private final String policyType;
	private final String insuranceCompany;
	private final double premiumAmount;
	private final double sumAssured;
	private final String policyStatus;

	InsurancePolicy(int policyId, String policyHolderName, String policyType, String insuranceCompany, double premiumAmount, double sumAssured, String policyStatus) {

		this.policyId = policyId;
		this.policyHolderName = policyHolderName;
		this.policyType = policyType;
		this.insuranceCompany = insuranceCompany;
		this.premiumAmount = premiumAmount;
		this.sumAssured = sumAssured;
		this.policyStatus = policyStatus;
	}

	public int getPolicyId() {
		return policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

}
