package immutableClassProgram;

public class InsurancePolicyDriver {

	public static void main(String[] args) {

		InsurancePolicy i1 = new InsurancePolicy(101, "Rahul Sharma", "Life Insurance", "LIC", 25000.00, 1000000.00, "Active");
		InsurancePolicy i2 = new InsurancePolicy(102, "Priya Verma", "Health Insurance", "HDFC ERGO", 18000.50, 500000.00, "Active");
		InsurancePolicy i3 = new InsurancePolicy(103, "Amit Singh", "Vehicle Insurance", "ICICI Lombard", 12500.00, 800000.00, "Active");
		InsurancePolicy i4 = new InsurancePolicy(104, "Neha Gupta", "Life Insurance", "SBI Life", 30000.75, 1500000.00, "Active");
		InsurancePolicy i5 = new InsurancePolicy(105, "Rohit Kumar", "Health Insurance", "Star Health", 22000.00, 750000.00, "Active");
		InsurancePolicy i6 = new InsurancePolicy(106, "Anjali Mishra", "Vehicle Insurance", "Bajaj Allianz", 15000.25, 600000.00, "Expired");
		InsurancePolicy i7 = new InsurancePolicy(107, "Vikas Yadav", "Life Insurance", "Max Life", 28000.00, 1200000.00, "Active");
		InsurancePolicy i8 = new InsurancePolicy(108, "Sneha Kapoor", "Health Insurance", "Niva Bupa", 19500.50, 1000000.00, "Active");
		InsurancePolicy i9 = new InsurancePolicy(109, "Karan Malhotra", "Vehicle Insurance", "Tata AIG", 11000.00, 500000.00, "Active");
		InsurancePolicy i10 = new InsurancePolicy(110, "Pooja Agarwal", "Life Insurance", "LIC", 35000.75, 2000000.00, "Active");
		InsurancePolicy i11 = new InsurancePolicy(111, "Aditya Srivastava", "Health Insurance", "Care Health", 24000.00, 800000.00, "Pending");
		InsurancePolicy i12 = new InsurancePolicy(112, "Simran Kaur", "Vehicle Insurance", "Reliance General", 13500.50, 700000.00, "Active");
		InsurancePolicy i13 = new InsurancePolicy(113, "Nikhil Jain", "Life Insurance", "ICICI Prudential", 32000.25, 1800000.00, "Active");
		InsurancePolicy i14 = new InsurancePolicy(114, "Kavita Joshi", "Health Insurance", "Star Health", 21000.00, 600000.00, "Expired");
		InsurancePolicy i15 = new InsurancePolicy(115, "Saurabh Tiwari", "Vehicle Insurance", "HDFC ERGO", 14500.75, 900000.00, "Active");
		InsurancePolicy i16 = new InsurancePolicy(116, "Riya Mehta", "Life Insurance", "SBI Life", 27500.00, 1250000.00, "Active");
		InsurancePolicy i17 = new InsurancePolicy(117, "Manish Pandey", "Health Insurance", "Niva Bupa", 23000.50, 900000.00, "Pending");
		InsurancePolicy i18 = new InsurancePolicy(118, "Swati Saxena", "Vehicle Insurance", "Bajaj Allianz", 12000.00, 550000.00, "Active");
		InsurancePolicy i19 = new InsurancePolicy(119, "Akash Tripathi", "Life Insurance", "Max Life", 40000.25, 2500000.00, "Active");
		InsurancePolicy i20 = new InsurancePolicy(120, "Divya Singh", "Health Insurance", "Care Health", 26000.00, 1000000.00, "Active");

				
		System.out.println("===============================Insurance Policy 1 Details==================================");

		System.out.println("Policy Id: " + i1.getPolicyId());
		System.out.println("Policy Holder Name: " + i1.getPolicyHolderName());
		System.out.println("Policy Type: " + i1.getPolicyType());
		System.out.println("Insurance Company: " + i1.getInsuranceCompany());
		System.out.println("Premium Amount: " + i1.getPremiumAmount());
		System.out.println("Sum Assured: " + i1.getSumAssured());
		System.out.println("Policy Status: " + i1.getPolicyStatus());


		System.out.println("===============================Insurance Policy 2 Details==================================");

		System.out.println("Policy Id: " + i2.getPolicyId());
		System.out.println("Policy Holder Name: " + i2.getPolicyHolderName());
		System.out.println("Policy Type: " + i2.getPolicyType());
		System.out.println("Insurance Company: " + i2.getInsuranceCompany());
		System.out.println("Premium Amount: " + i2.getPremiumAmount());
		System.out.println("Sum Assured: " + i2.getSumAssured());
		System.out.println("Policy Status: " + i2.getPolicyStatus());


		System.out.println("===============================Insurance Policy 3 Details==================================");

		System.out.println("Policy Id: " + i3.getPolicyId());
		System.out.println("Policy Holder Name: " + i3.getPolicyHolderName());
		System.out.println("Policy Type: " + i3.getPolicyType());
		System.out.println("Insurance Company: " + i3.getInsuranceCompany());
		System.out.println("Premium Amount: " + i3.getPremiumAmount());
		System.out.println("Sum Assured: " + i3.getSumAssured());
		System.out.println("Policy Status: " + i3.getPolicyStatus());


		System.out.println("===============================Insurance Policy 4 Details==================================");

		System.out.println("Policy Id: " + i4.getPolicyId());
		System.out.println("Policy Holder Name: " + i4.getPolicyHolderName());
		System.out.println("Policy Type: " + i4.getPolicyType());
		System.out.println("Insurance Company: " + i4.getInsuranceCompany());
		System.out.println("Premium Amount: " + i4.getPremiumAmount());
		System.out.println("Sum Assured: " + i4.getSumAssured());
		System.out.println("Policy Status: " + i4.getPolicyStatus());


		System.out.println("===============================Insurance Policy 5 Details==================================");

		System.out.println("Policy Id: " + i5.getPolicyId());
		System.out.println("Policy Holder Name: " + i5.getPolicyHolderName());
		System.out.println("Policy Type: " + i5.getPolicyType());
		System.out.println("Insurance Company: " + i5.getInsuranceCompany());
		System.out.println("Premium Amount: " + i5.getPremiumAmount());
		System.out.println("Sum Assured: " + i5.getSumAssured());
		System.out.println("Policy Status: " + i5.getPolicyStatus());


		System.out.println("===============================Insurance Policy 6 Details==================================");

		System.out.println("Policy Id: " + i6.getPolicyId());
		System.out.println("Policy Holder Name: " + i6.getPolicyHolderName());
		System.out.println("Policy Type: " + i6.getPolicyType());
		System.out.println("Insurance Company: " + i6.getInsuranceCompany());
		System.out.println("Premium Amount: " + i6.getPremiumAmount());
		System.out.println("Sum Assured: " + i6.getSumAssured());
		System.out.println("Policy Status: " + i6.getPolicyStatus());


		System.out.println("===============================Insurance Policy 7 Details==================================");

		System.out.println("Policy Id: " + i7.getPolicyId());
		System.out.println("Policy Holder Name: " + i7.getPolicyHolderName());
		System.out.println("Policy Type: " + i7.getPolicyType());
		System.out.println("Insurance Company: " + i7.getInsuranceCompany());
		System.out.println("Premium Amount: " + i7.getPremiumAmount());
		System.out.println("Sum Assured: " + i7.getSumAssured());
		System.out.println("Policy Status: " + i7.getPolicyStatus());


		System.out.println("===============================Insurance Policy 8 Details==================================");

		System.out.println("Policy Id: " + i8.getPolicyId());
		System.out.println("Policy Holder Name: " + i8.getPolicyHolderName());
		System.out.println("Policy Type: " + i8.getPolicyType());
		System.out.println("Insurance Company: " + i8.getInsuranceCompany());
		System.out.println("Premium Amount: " + i8.getPremiumAmount());
		System.out.println("Sum Assured: " + i8.getSumAssured());
		System.out.println("Policy Status: " + i8.getPolicyStatus());


		System.out.println("===============================Insurance Policy 9 Details==================================");

		System.out.println("Policy Id: " + i9.getPolicyId());
		System.out.println("Policy Holder Name: " + i9.getPolicyHolderName());
		System.out.println("Policy Type: " + i9.getPolicyType());
		System.out.println("Insurance Company: " + i9.getInsuranceCompany());
		System.out.println("Premium Amount: " + i9.getPremiumAmount());
		System.out.println("Sum Assured: " + i9.getSumAssured());
		System.out.println("Policy Status: " + i9.getPolicyStatus());


		System.out.println("===============================Insurance Policy 10 Details==================================");

		System.out.println("Policy Id: " + i10.getPolicyId());
		System.out.println("Policy Holder Name: " + i10.getPolicyHolderName());
		System.out.println("Policy Type: " + i10.getPolicyType());
		System.out.println("Insurance Company: " + i10.getInsuranceCompany());
		System.out.println("Premium Amount: " + i10.getPremiumAmount());
		System.out.println("Sum Assured: " + i10.getSumAssured());
		System.out.println("Policy Status: " + i10.getPolicyStatus());


		System.out.println("===============================Insurance Policy 11 Details==================================");

		System.out.println("Policy Id: " + i11.getPolicyId());
		System.out.println("Policy Holder Name: " + i11.getPolicyHolderName());
		System.out.println("Policy Type: " + i11.getPolicyType());
		System.out.println("Insurance Company: " + i11.getInsuranceCompany());
		System.out.println("Premium Amount: " + i11.getPremiumAmount());
		System.out.println("Sum Assured: " + i11.getSumAssured());
		System.out.println("Policy Status: " + i11.getPolicyStatus());


		System.out.println("===============================Insurance Policy 12 Details==================================");

		System.out.println("Policy Id: " + i12.getPolicyId());
		System.out.println("Policy Holder Name: " + i12.getPolicyHolderName());
		System.out.println("Policy Type: " + i12.getPolicyType());
		System.out.println("Insurance Company: " + i12.getInsuranceCompany());
		System.out.println("Premium Amount: " + i12.getPremiumAmount());
		System.out.println("Sum Assured: " + i12.getSumAssured());
		System.out.println("Policy Status: " + i12.getPolicyStatus());


		System.out.println("===============================Insurance Policy 13 Details==================================");

		System.out.println("Policy Id: " + i13.getPolicyId());
		System.out.println("Policy Holder Name: " + i13.getPolicyHolderName());
		System.out.println("Policy Type: " + i13.getPolicyType());
		System.out.println("Insurance Company: " + i13.getInsuranceCompany());
		System.out.println("Premium Amount: " + i13.getPremiumAmount());
		System.out.println("Sum Assured: " + i13.getSumAssured());
		System.out.println("Policy Status: " + i13.getPolicyStatus());


		System.out.println("===============================Insurance Policy 14 Details==================================");

		System.out.println("Policy Id: " + i14.getPolicyId());
		System.out.println("Policy Holder Name: " + i14.getPolicyHolderName());
		System.out.println("Policy Type: " + i14.getPolicyType());
		System.out.println("Insurance Company: " + i14.getInsuranceCompany());
		System.out.println("Premium Amount: " + i14.getPremiumAmount());
		System.out.println("Sum Assured: " + i14.getSumAssured());
		System.out.println("Policy Status: " + i14.getPolicyStatus());


		System.out.println("===============================Insurance Policy 15 Details==================================");

		System.out.println("Policy Id: " + i15.getPolicyId());
		System.out.println("Policy Holder Name: " + i15.getPolicyHolderName());
		System.out.println("Policy Type: " + i15.getPolicyType());
		System.out.println("Insurance Company: " + i15.getInsuranceCompany());
		System.out.println("Premium Amount: " + i15.getPremiumAmount());
		System.out.println("Sum Assured: " + i15.getSumAssured());
		System.out.println("Policy Status: " + i15.getPolicyStatus());


		System.out.println("===============================Insurance Policy 16 Details==================================");

		System.out.println("Policy Id: " + i16.getPolicyId());
		System.out.println("Policy Holder Name: " + i16.getPolicyHolderName());
		System.out.println("Policy Type: " + i16.getPolicyType());
		System.out.println("Insurance Company: " + i16.getInsuranceCompany());
		System.out.println("Premium Amount: " + i16.getPremiumAmount());
		System.out.println("Sum Assured: " + i16.getSumAssured());
		System.out.println("Policy Status: " + i16.getPolicyStatus());


		System.out.println("===============================Insurance Policy 17 Details==================================");

		System.out.println("Policy Id: " + i17.getPolicyId());
		System.out.println("Policy Holder Name: " + i17.getPolicyHolderName());
		System.out.println("Policy Type: " + i17.getPolicyType());
		System.out.println("Insurance Company: " + i17.getInsuranceCompany());
		System.out.println("Premium Amount: " + i17.getPremiumAmount());
		System.out.println("Sum Assured: " + i17.getSumAssured());
		System.out.println("Policy Status: " + i17.getPolicyStatus());


		System.out.println("===============================Insurance Policy 18 Details==================================");

		System.out.println("Policy Id: " + i18.getPolicyId());
		System.out.println("Policy Holder Name: " + i18.getPolicyHolderName());
		System.out.println("Policy Type: " + i18.getPolicyType());
		System.out.println("Insurance Company: " + i18.getInsuranceCompany());
		System.out.println("Premium Amount: " + i18.getPremiumAmount());
		System.out.println("Sum Assured: " + i18.getSumAssured());
		System.out.println("Policy Status: " + i18.getPolicyStatus());


		System.out.println("===============================Insurance Policy 19 Details==================================");

		System.out.println("Policy Id: " + i19.getPolicyId());
		System.out.println("Policy Holder Name: " + i19.getPolicyHolderName());
		System.out.println("Policy Type: " + i19.getPolicyType());
		System.out.println("Insurance Company: " + i19.getInsuranceCompany());
		System.out.println("Premium Amount: " + i19.getPremiumAmount());
		System.out.println("Sum Assured: " + i19.getSumAssured());
		System.out.println("Policy Status: " + i19.getPolicyStatus());


		System.out.println("===============================Insurance Policy 20 Details==================================");

		System.out.println("Policy Id: " + i20.getPolicyId());
		System.out.println("Policy Holder Name: " + i20.getPolicyHolderName());
		System.out.println("Policy Type: " + i20.getPolicyType());
		System.out.println("Insurance Company: " + i20.getInsuranceCompany());
		System.out.println("Premium Amount: " + i20.getPremiumAmount());
		System.out.println("Sum Assured: " + i20.getSumAssured());
		System.out.println("Policy Status: " + i20.getPolicyStatus());

	}

}
