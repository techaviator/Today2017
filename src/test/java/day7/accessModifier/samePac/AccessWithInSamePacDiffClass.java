package day7.accessModifier.samePac;

public class AccessWithInSamePacDiffClass {
	
	public static void main(String[] args) {
		AccessWithInSameClass accessWithInSameClass = new AccessWithInSameClass();
	//	System.out.println(accessWithInSameClass.x); //private can only be accessed with the same class
		
		System.out.println(accessWithInSameClass.y);
		accessWithInSameClass.defaultMethod();
		
		System.out.println(accessWithInSameClass.z);
		accessWithInSameClass.protectedMethod();
		
		System.out.println(accessWithInSameClass.a);
		accessWithInSameClass.publicMethod();
	}

}
