package day7.accessModifier.outsidePac;

import day7.accessModifier.samePac.AccessWithInSameClass;
import day7.inheritance.CalculatorBasic;

public class AccessOutsidePac extends CalculatorBasic{
	
	public void getAValue(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		AccessWithInSameClass accessWithInSameClass = new AccessWithInSameClass();
		//System.out.println(accessWithInSameClass.x); // cannot access outside the package
		//accessWithInSameClass.y; // cannot access default variable and method outside package
	
		/*System.out.println(accessWithInSameClass.z);
		accessWithInSameClass.protectedMethod();*/ // cannot be accessed outside package
		
		System.out.println(accessWithInSameClass.a);
		accessWithInSameClass.publicMethod();
	}

}
