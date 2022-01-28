package ch06;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	
	public GoldCustomer(int customerID, String customername) {
		super(customerID, customername);
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}
	
	public int calcPirce(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price*salesRatio);
	}

}
