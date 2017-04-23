package day7.inheritance;

public class CalculatorExtra extends CalculatorBasic {
	
	public void add2Sub10(){
		super.add();
		Result = Result-10;
	}
	
	public void add(){
		Result = x+100;
	}
	
	public void getBasicAdd()
	{
		super.add();
	}

}
