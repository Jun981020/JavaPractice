package ch06;

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
	}
	
	
	
	
	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}




	public String getAgentID() {
		return agentID;
	}

}
