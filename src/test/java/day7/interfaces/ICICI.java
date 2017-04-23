package day7.interfaces;

public class ICICI implements RBI {

	@Override
	public void setGoldLoanInterest() {
		System.out.println("The gold loan interest is 13%");
		
	}

	@Override
	public void setFixedDeposit() {
		System.out.println("The fixed deposit interest is 7%");
		
	}

}
