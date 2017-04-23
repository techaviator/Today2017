package day7.accessModifier.samePac;

public class AccessWithInSameClass {
	
	private  int x=10; //private variable
	int y=20; //
	protected int z= 30;
	public int a = 40;
	
	private  void privateMethod(){
		System.out.println("This is a private method");
	}
	
	void defaultMethod(){
		System.out.println("This is a default method");
	}
	
	protected void protectedMethod(){
		System.out.println("This is a protected method");
	}
	
	public  void publicMethod(){
		System.out.println("This is a public method");
	}
	
	
	
	public static void main(String[] args) {
		AccessWithInSameClass accessWithInSameClass = new AccessWithInSameClass();
		System.out.println(accessWithInSameClass.x);
		accessWithInSameClass.privateMethod();
		
		System.out.println(accessWithInSameClass.y);
		accessWithInSameClass.defaultMethod();
		
		System.out.println(accessWithInSameClass.z);
		accessWithInSameClass.protectedMethod();
		
		System.out.println(accessWithInSameClass.a);
		accessWithInSameClass.publicMethod();
	}

}
