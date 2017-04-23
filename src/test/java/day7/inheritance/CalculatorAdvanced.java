package day7.inheritance;

public class CalculatorAdvanced extends CalculatorExtra{
	
	public void add2Sub10div10(){
		add2Sub10();
		Result = Result/10;
	}
	
	public void getadd()
	{
		super.add();
	}

}
