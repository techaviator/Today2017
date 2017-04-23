package day7.interfaces;

public class SBI implements RBI {

	@Override
	public void setGoldLoanInterest() {
	
		System.out.println("The gold loan interest is 4%");
	}

	@Override
	public void setFixedDeposit() {
		
		System.out.println("The interest is 6%");
	}

}
