package day7.inheritance;

public class RunInheritance {
	
	public static void main(String[] args) {
		/*CalculatorBasic calculatorBasic = new  CalculatorBasic();
		calculatorBasic.add();
		System.out.println(calculatorBasic.Result);*/
		
		/*CalculatorExtra calculatorExtra = new CalculatorExtra();
		calculatorExtra.add();
		System.out.println(calculatorExtra.Result);
		calculatorExtra.add2Sub10();
		System.out.println(calculatorExtra.Result);*/
		
		CalculatorAdvanced calculatorAdvanced = new CalculatorAdvanced();
		calculatorAdvanced.add();
		System.out.println(calculatorAdvanced.Result); //200
		calculatorAdvanced.add2Sub10();//190
		System.out.println(calculatorAdvanced.Result);
		calculatorAdvanced.add2Sub10div10();//19
		System.out.println(calculatorAdvanced.Result);
		calculatorAdvanced.getadd();
		System.out.println(calculatorAdvanced.Result);
		
		calculatorAdvanced.getBasicAdd();
		System.out.println(calculatorAdvanced.Result);
	}

}
