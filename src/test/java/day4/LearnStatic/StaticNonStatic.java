package day4.LearnStatic;

import day4.student.Student;

public class StaticNonStatic {
	
	String name;
	int phy;
	int che;
	int total;
	static String SCHOOLNAME ="St.Joseph";
	
	public void displayTotal()
	{
		System.out.println("Name= "+name+" phy= "+phy+" che= "+che+" Total= "+total+" schoolname= "+SCHOOLNAME);
	}
	
	public static void main(String[] args) {
		StaticNonStatic staticNonStatic = new StaticNonStatic();
/*		System.out.println(staticNonStatic.phy);
		staticNonStatic.displayTotal();*/
		//System.out.println(SCHOOLNAME);
		//staticNonStatic.getSchoolName();
		getSchool();
	}
	
	public void getSchoolName()
	{
		System.out.println(SCHOOLNAME);
	}
	
	public static void getSchool()
	{
		System.out.println(SCHOOLNAME);
	}
	
	
	public void getTotal()
	{
		System.out.println(total);
	}
	
	
	 
	

}
