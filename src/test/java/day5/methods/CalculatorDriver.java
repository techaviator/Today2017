package day5.methods;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//calculator.add(10, 20);
		double result = calculator.add(11.0, 5);
		System.out.println(result);
		
	
		System.out.println(calculator.add(10, 20, 30, 40));
	}

}
