package day4.student;

public class Imm_Student {
	
	public static void main(String[] args) {
		Student imm=new Student();
		
		imm.name="Immanuel";
		imm.phy=12;
		imm.che=13;
	imm.total=25;
	imm.displayTotal();
	System.out.println("che " +imm.che);
	System.out.println("Total "+imm.total);
	System.out.println(imm.name);
	Student deb=new Student();
	deb.che=22;
	System.out.println(deb.che);
	Student gur=new Student();
	gur.total=24;
	System.out.println("Total" + gur.total);
	System.out.println(Student.SCHOOLNAME);
	
		
	}
	
	public void getSchool()
	{
		System.out.println(Student.SCHOOLNAME);
	}

}
