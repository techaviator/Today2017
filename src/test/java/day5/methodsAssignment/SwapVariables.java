package day5.methodsAssignment;

public class SwapVariables {
	
	public SwapObjectVariables swap(SwapObjectVariables obj){
		String temp=obj.x;
		obj.x=obj.y;
		obj.y=temp;
		return obj;
	}

}
