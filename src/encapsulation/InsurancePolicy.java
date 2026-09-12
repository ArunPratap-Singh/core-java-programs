package encapsulation;

public class InsurancePolicy {
	
	private String policyname;
	private String policyholdername;
	private String agentname;
	private String policynumber;
	private double premium;
	private int policyperiod;
	
	InsurancePolicy(String policyname, String policyholdername, String agentname, String policynumber, double premium, int policyperiod){
		
		this.policyname = policyname;
		this.policyholdername = policyholdername;
		this.agentname = agentname;
		this.policynumber = policynumber;
		this.premium = premium;
		this.policyperiod = policyperiod;
	}
	
	public void setPolicyname(String policyname) {
		if(policyname.length()>3 && policyname.length()<=30 && !policyname.isBlank() && policyname.matches("[A-Z a-z \s]+"))
			this.policyname = policyname;
		else
			System.out.println("Invalid policy Name");
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyHolderName(String policyholdername) {
		if(policyholdername.length()>3 && !policyholdername.isBlank() && policyholdername.length()<=50 && policyholdername.matches("[A-Z a-z \s]+"))
			this.policyholdername = policyholdername;
		
		else
			System.out.println("Invalid Name");
	}
	public String getPolicyHolderName() {
		return policyholdername;
	}
	public void setAgentName(String agentname) {
		if(agentname.length()>3 && agentname.length()<=30 && !agentname.isBlank() && agentname.matches("[A-Z a-z \s]+"))
			this.agentname = agentname;
		else
			System.out.println("Invalid policy Name");
	}
	public String getAgentname() {
		return agentname;
	}
	public void setPolicyNumber(String policynumber) {
		if(!policynumber.isBlank()&& policynumber.matches("[A-Z a-z 1-100]+"))
			this.policynumber = policynumber;
	}
	public String getPolicyNumber() {
		return policynumber;
	}
	public void setPremium(double premium) {
		if(premium>99)
			this.premium = premium;
		else
			System.out.println("Invalid premium");
	}
	public double getPremium() {
		return premium;
	}
	public void setPolicyPeriod(int policyperiod) {
		if(policyperiod>1 && policyperiod<108)
			this.policyperiod = policyperiod;
	}
	public int getPolicyPeriod() {
		return policyperiod;
	}
 
}
