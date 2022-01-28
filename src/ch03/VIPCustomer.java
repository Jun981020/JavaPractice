package ch03;

public class VIPCustomer extends Customer {



	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		
		super(0,null);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer()호출됨");
	}*/

	public VIPCustomer(int customerID, String customername) {
		super(customerID, customername);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int,String)call");
	}
	
	
	public String getAgentID() {
		return agentID;
	}

}
