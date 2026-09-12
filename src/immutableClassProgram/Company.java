package immutableClassProgram;

public final class Company {

	private final int companyId;
	private final String companyName;
	private final String industry;
	private final String founder;
	private final double revenue;
	private final String headquarters;
	private final int employeeCount;

	Company(int companyId, String companyName, String industry, String founder, double revenue, String headquarters, int employeeCount) {

		this.companyId = companyId;
		this.companyName = companyName;
		this.industry = industry;
		this.founder = founder;
		this.revenue = revenue;
		this.headquarters = headquarters;
		this.employeeCount = employeeCount;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getIndustry() {
		return industry;
	}

	public String getFounder() {
		return founder;
	}

	public double getRevenue() {
		return revenue;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

}
