package day5.methods;

public class Calculator {
	
	public void add(int x, int y){		
		System.out.println(x+y);		
	}
	
	public void subtract(int x, int y){
		System.out.println(x-y);
	}
	
	public void add(int x, int y, int z){
		System.out.println(x+y+z);
	}
	
	public int add(int x, int y, int z, int a){
		return x+y+z+a;		
	}
	
	public void add(int x, double y){
		
	}
	
	public double add(double y, int x){
		double z=y+x;
		return z;
	}
	
	
	public String getName(){
		return "TechAviator";
	}
	
	

	
}
