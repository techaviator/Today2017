package day4.student;

public class StudentMultipleObjects {
	
	public static void main(String[] args) {
		Student gun=new Student();
		
		gun.name="gurmeen";
		gun.phy=13;
		gun.che=14;
		gun.total=27;
		//gun.schoolName="St. Joseph";
		//gun.displayTotal();
		
		Student imm=new Student();
		
		imm.name="Immanuel";
		imm.phy=12;
		imm.che=13;
	imm.total=25;
	//imm.schoolName="St. Joseph";
	//imm.displayTotal();
	
	Student deb=new Student();
	deb.name = "Debjyoti";
	deb.phy=10;
	deb.che=11;
	deb.total=21;
	//deb.schoolName="St. Joseph";
	//deb.displayTotal();
	}

}
