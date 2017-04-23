package day5.methods.PassByReference;

public class PassObjectByReference {
	
	public static void main(String[] args) {
		Student student = new Student();
		/*student.name="Jim";
		student.age = 25;*/
		setStudentInfo(student, "jim", 25);
		/*System.out.println(student.name);
		System.out.println(student.age);*/
		displayStudentInfo(student);
		
		Student student1 = new Student();
		/*student1.name="Gautam";
		student1.age = 26;*/
		setStudentInfo(student1, "Gautam", 26);
		/*System.out.println(student1.name);
		System.out.println(student1.age);*/
		displayStudentInfo(student1);
	}
	
	
	public static void displayStudentInfo(Student s){
		System.out.println(s.name);
		System.out.println(s.age);
	}
	
	public static void setStudentInfo(Student s, String name, int age){
		s.name =name;
		s.age=age;
	}
	

}
