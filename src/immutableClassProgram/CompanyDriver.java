package immutableClassProgram;

public class CompanyDriver {

	public static void main(String[] args) {

		Company c1 = new Company(101, "Tata Consultancy Services", "Information Technology", "Tata Sons", 250000.50, "Mumbai", 600000);
		Company c2 = new Company(102, "Infosys", "Information Technology", "N. R. Narayana Murthy", 180000.75, "Bangalore", 320000);
		Company c3 = new Company(103, "Wipro", "Information Technology", "M. H. Hasham Premji", 95000.25, "Bangalore", 240000);
		Company c4 = new Company(104, "HCL Technologies", "Information Technology", "Shiv Nadar", 110000.80, "Noida", 225000);
		Company c5 = new Company(105, "Tech Mahindra", "Information Technology", "Anand Mahindra", 65000.50, "Pune", 150000);
		Company c6 = new Company(106, "Reliance Industries", "Conglomerate", "Dhirubhai Ambani", 850000.90, "Mumbai", 400000);
		Company c7 = new Company(107, "Hindustan Unilever", "Consumer Goods", "William Lever", 550000.60, "Mumbai", 45000);
		Company c8 = new Company(108, "ITC Limited", "FMCG", "C. H. Venkatraman", 720000.45, "Kolkata", 36000);
		Company c9 = new Company(109, "Adani Enterprises", "Infrastructure", "Gautam Adani", 780000.30, "Ahmedabad", 50000);
		Company c10 = new Company(110, "Larsen & Toubro", "Engineering", "Henning Holck-Larsen", 200000.75, "Mumbai", 55000);
		Company c11 = new Company(111, "Axis Bank", "Banking", "P. J. Nayak", 125000.50, "Mumbai", 95000);
		Company c12 = new Company(112, "HDFC Bank", "Banking", "Hasmukhbhai Parekh", 300000.80, "Mumbai", 180000);
		Company c13 = new Company(113, "ICICI Bank", "Banking", "Industrial Credit and Investment Corporation", 280000.65, "Mumbai", 135000);
		Company c14 = new Company(114, "State Bank of India", "Banking", "Government of India", 450000.90, "Mumbai", 250000);
		Company c15 = new Company(115, "Maruti Suzuki", "Automobile", "Osamu Suzuki", 150000.40, "New Delhi", 40000);
		Company c16 = new Company(116, "Mahindra & Mahindra", "Automobile", "Jagadish Chandra Mahindra", 175000.55, "Mumbai", 30000);
		Company c17 = new Company(117, "Bajaj Auto", "Automobile", "Jamnalal Bajaj", 125000.70, "Pune", 10000);
		Company c18 = new Company(118, "Asian Paints", "Paints and Chemicals", "Champaklal Choksi", 95000.35, "Mumbai", 8500);
		Company c19 = new Company(119, "Dr. Reddy's Laboratories", "Pharmaceuticals", "Kallam Anji Reddy", 85000.25, "Hyderabad", 24000);
		Company c20 = new Company(120, "Sun Pharmaceutical", "Pharmaceuticals", "Dilip Shanghvi", 175000.95, "Mumbai", 43000);
		
		
		System.out.println("==========================Company Details 1================================");
		System.out.println("ObjectReference is: " + c1);
		System.out.println("Company Id is: " + c1.getCompanyId());
		System.out.println("Company Name is: " + c1.getCompanyName());
		System.out.println("Industry is: " + c1.getIndustry());
		System.out.println("Founder is: " + c1.getFounder());
		System.out.println("Revenue is: " + c1.getRevenue());
		System.out.println("Headquarters is: " + c1.getHeadquarters());
		System.out.println("Employee Count is: " + c1.getEmployeeCount());


		System.out.println("==========================Company Details 2================================");
		System.out.println("ObjectReference is: " + c2);
		System.out.println("Company Id is: " + c2.getCompanyId());
		System.out.println("Company Name is: " + c2.getCompanyName());
		System.out.println("Industry is: " + c2.getIndustry());
		System.out.println("Founder is: " + c2.getFounder());
		System.out.println("Revenue is: " + c2.getRevenue());
		System.out.println("Headquarters is: " + c2.getHeadquarters());
		System.out.println("Employee Count is: " + c2.getEmployeeCount());


		System.out.println("==========================Company Details 3================================");
		System.out.println("ObjectReference is: " + c3);
		System.out.println("Company Id is: " + c3.getCompanyId());
		System.out.println("Company Name is: " + c3.getCompanyName());
		System.out.println("Industry is: " + c3.getIndustry());
		System.out.println("Founder is: " + c3.getFounder());
		System.out.println("Revenue is: " + c3.getRevenue());
		System.out.println("Headquarters is: " + c3.getHeadquarters());
		System.out.println("Employee Count is: " + c3.getEmployeeCount());


		System.out.println("==========================Company Details 4================================");
		System.out.println("ObjectReference is: " + c4);
		System.out.println("Company Id is: " + c4.getCompanyId());
		System.out.println("Company Name is: " + c4.getCompanyName());
		System.out.println("Industry is: " + c4.getIndustry());
		System.out.println("Founder is: " + c4.getFounder());
		System.out.println("Revenue is: " + c4.getRevenue());
		System.out.println("Headquarters is: " + c4.getHeadquarters());
		System.out.println("Employee Count is: " + c4.getEmployeeCount());


		System.out.println("==========================Company Details 5================================");
		System.out.println("ObjectReference is: " + c5);
		System.out.println("Company Id is: " + c5.getCompanyId());
		System.out.println("Company Name is: " + c5.getCompanyName());
		System.out.println("Industry is: " + c5.getIndustry());
		System.out.println("Founder is: " + c5.getFounder());
		System.out.println("Revenue is: " + c5.getRevenue());
		System.out.println("Headquarters is: " + c5.getHeadquarters());
		System.out.println("Employee Count is: " + c5.getEmployeeCount());


		System.out.println("==========================Company Details 6================================");
		System.out.println("ObjectReference is: " + c6);
		System.out.println("Company Id is: " + c6.getCompanyId());
		System.out.println("Company Name is: " + c6.getCompanyName());
		System.out.println("Industry is: " + c6.getIndustry());
		System.out.println("Founder is: " + c6.getFounder());
		System.out.println("Revenue is: " + c6.getRevenue());
		System.out.println("Headquarters is: " + c6.getHeadquarters());
		System.out.println("Employee Count is: " + c6.getEmployeeCount());


		System.out.println("==========================Company Details 7================================");
		System.out.println("ObjectReference is: " + c7);
		System.out.println("Company Id is: " + c7.getCompanyId());
		System.out.println("Company Name is: " + c7.getCompanyName());
		System.out.println("Industry is: " + c7.getIndustry());
		System.out.println("Founder is: " + c7.getFounder());
		System.out.println("Revenue is: " + c7.getRevenue());
		System.out.println("Headquarters is: " + c7.getHeadquarters());
		System.out.println("Employee Count is: " + c7.getEmployeeCount());


		System.out.println("==========================Company Details 8================================");
		System.out.println("ObjectReference is: " + c8);
		System.out.println("Company Id is: " + c8.getCompanyId());
		System.out.println("Company Name is: " + c8.getCompanyName());
		System.out.println("Industry is: " + c8.getIndustry());
		System.out.println("Founder is: " + c8.getFounder());
		System.out.println("Revenue is: " + c8.getRevenue());
		System.out.println("Headquarters is: " + c8.getHeadquarters());
		System.out.println("Employee Count is: " + c8.getEmployeeCount());


		System.out.println("==========================Company Details 9================================");
		System.out.println("ObjectReference is: " + c9);
		System.out.println("Company Id is: " + c9.getCompanyId());
		System.out.println("Company Name is: " + c9.getCompanyName());
		System.out.println("Industry is: " + c9.getIndustry());
		System.out.println("Founder is: " + c9.getFounder());
		System.out.println("Revenue is: " + c9.getRevenue());
		System.out.println("Headquarters is: " + c9.getHeadquarters());
		System.out.println("Employee Count is: " + c9.getEmployeeCount());


		System.out.println("==========================Company Details 10================================");
		System.out.println("ObjectReference is: " + c10);
		System.out.println("Company Id is: " + c10.getCompanyId());
		System.out.println("Company Name is: " + c10.getCompanyName());
		System.out.println("Industry is: " + c10.getIndustry());
		System.out.println("Founder is: " + c10.getFounder());
		System.out.println("Revenue is: " + c10.getRevenue());
		System.out.println("Headquarters is: " + c10.getHeadquarters());
		System.out.println("Employee Count is: " + c10.getEmployeeCount());


		System.out.println("==========================Company Details 11================================");
		System.out.println("ObjectReference is: " + c11);
		System.out.println("Company Id is: " + c11.getCompanyId());
		System.out.println("Company Name is: " + c11.getCompanyName());
		System.out.println("Industry is: " + c11.getIndustry());
		System.out.println("Founder is: " + c11.getFounder());
		System.out.println("Revenue is: " + c11.getRevenue());
		System.out.println("Headquarters is: " + c11.getHeadquarters());
		System.out.println("Employee Count is: " + c11.getEmployeeCount());


		System.out.println("==========================Company Details 12================================");
		System.out.println("ObjectReference is: " + c12);
		System.out.println("Company Id is: " + c12.getCompanyId());
		System.out.println("Company Name is: " + c12.getCompanyName());
		System.out.println("Industry is: " + c12.getIndustry());
		System.out.println("Founder is: " + c12.getFounder());
		System.out.println("Revenue is: " + c12.getRevenue());
		System.out.println("Headquarters is: " + c12.getHeadquarters());
		System.out.println("Employee Count is: " + c12.getEmployeeCount());


		System.out.println("==========================Company Details 13================================");
		System.out.println("ObjectReference is: " + c13);
		System.out.println("Company Id is: " + c13.getCompanyId());
		System.out.println("Company Name is: " + c13.getCompanyName());
		System.out.println("Industry is: " + c13.getIndustry());
		System.out.println("Founder is: " + c13.getFounder());
		System.out.println("Revenue is: " + c13.getRevenue());
		System.out.println("Headquarters is: " + c13.getHeadquarters());
		System.out.println("Employee Count is: " + c13.getEmployeeCount());


		System.out.println("==========================Company Details 14================================");
		System.out.println("ObjectReference is: " + c14);
		System.out.println("Company Id is: " + c14.getCompanyId());
		System.out.println("Company Name is: " + c14.getCompanyName());
		System.out.println("Industry is: " + c14.getIndustry());
		System.out.println("Founder is: " + c14.getFounder());
		System.out.println("Revenue is: " + c14.getRevenue());
		System.out.println("Headquarters is: " + c14.getHeadquarters());
		System.out.println("Employee Count is: " + c14.getEmployeeCount());


		System.out.println("==========================Company Details 15================================");
		System.out.println("ObjectReference is: " + c15);
		System.out.println("Company Id is: " + c15.getCompanyId());
		System.out.println("Company Name is: " + c15.getCompanyName());
		System.out.println("Industry is: " + c15.getIndustry());
		System.out.println("Founder is: " + c15.getFounder());
		System.out.println("Revenue is: " + c15.getRevenue());
		System.out.println("Headquarters is: " + c15.getHeadquarters());
		System.out.println("Employee Count is: " + c15.getEmployeeCount());


		System.out.println("==========================Company Details 16================================");
		System.out.println("ObjectReference is: " + c16);
		System.out.println("Company Id is: " + c16.getCompanyId());
		System.out.println("Company Name is: " + c16.getCompanyName());
		System.out.println("Industry is: " + c16.getIndustry());
		System.out.println("Founder is: " + c16.getFounder());
		System.out.println("Revenue is: " + c16.getRevenue());
		System.out.println("Headquarters is: " + c16.getHeadquarters());
		System.out.println("Employee Count is: " + c16.getEmployeeCount());


		System.out.println("==========================Company Details 17================================");
		System.out.println("ObjectReference is: " + c17);
		System.out.println("Company Id is: " + c17.getCompanyId());
		System.out.println("Company Name is: " + c17.getCompanyName());
		System.out.println("Industry is: " + c17.getIndustry());
		System.out.println("Founder is: " + c17.getFounder());
		System.out.println("Revenue is: " + c17.getRevenue());
		System.out.println("Headquarters is: " + c17.getHeadquarters());
		System.out.println("Employee Count is: " + c17.getEmployeeCount());


		System.out.println("==========================Company Details 18================================");
		System.out.println("ObjectReference is: " + c18);
		System.out.println("Company Id is: " + c18.getCompanyId());
		System.out.println("Company Name is: " + c18.getCompanyName());
		System.out.println("Industry is: " + c18.getIndustry());
		System.out.println("Founder is: " + c18.getFounder());
		System.out.println("Revenue is: " + c18.getRevenue());
		System.out.println("Headquarters is: " + c18.getHeadquarters());
		System.out.println("Employee Count is: " + c18.getEmployeeCount());


		System.out.println("==========================Company Details 19================================");
		System.out.println("ObjectReference is: " + c19);
		System.out.println("Company Id is: " + c19.getCompanyId());
		System.out.println("Company Name is: " + c19.getCompanyName());
		System.out.println("Industry is: " + c19.getIndustry());
		System.out.println("Founder is: " + c19.getFounder());
		System.out.println("Revenue is: " + c19.getRevenue());
		System.out.println("Headquarters is: " + c19.getHeadquarters());
		System.out.println("Employee Count is: " + c19.getEmployeeCount());


		System.out.println("==========================Company Details 20================================");
		System.out.println("ObjectReference is: " + c20);
		System.out.println("Company Id is: " + c20.getCompanyId());
		System.out.println("Company Name is: " + c20.getCompanyName());
		System.out.println("Industry is: " + c20.getIndustry());
		System.out.println("Founder is: " + c20.getFounder());
		System.out.println("Revenue is: " + c20.getRevenue());
		System.out.println("Headquarters is: " + c20.getHeadquarters());
		System.out.println("Employee Count is: " + c20.getEmployeeCount());

	}

}
