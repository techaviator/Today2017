package day5.methodsAssignment;

public class SwapObjectVariables {
	
	String x="India";
	String y= "US";
	
	public static void main(String[] args) {
		SwapObjectVariables swap = new SwapObjectVariables();
		System.out.println(swap.x+"\t"+swap.y);
		//Assignment 
			// Create a new Class 
			//Create a method to swap x and y (Condition , the method takes only the reference of the object SwapObjectVariables 
		SwapVariables swapVariables = new SwapVariables();
		swap = swapVariables.swap(swap);
		System.out.println(swap.x+"\t"+swap.y);
	}

}
