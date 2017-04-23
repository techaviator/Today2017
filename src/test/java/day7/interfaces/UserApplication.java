package day7.interfaces;

import java.util.Scanner;

public class UserApplication {
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the bank name");
		String bankName = scan.nextLine();
		scan.close();
		RBI rbi = null;
		System.out.println("THe bank chosen is "+bankName);
		if(bankName.equalsIgnoreCase("sbi")){
			rbi= new SBI();
			/*sbi.setGoldLoanInterest();
			sbi.setFixedDeposit();*/
		}
		else if(bankName.equalsIgnoreCase("icici")){
			rbi = new ICICI();
			/*icici.setGoldLoanInterest();
			icici.setFixedDeposit();*/
		}
		else{
			System.out.println("Please re enter a valid bank name");
		}
		
		if(rbi!=null){
			rbi.setGoldLoanInterest();
			rbi.setFixedDeposit();
		}
		
	}

}
