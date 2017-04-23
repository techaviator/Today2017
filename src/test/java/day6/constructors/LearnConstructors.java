package day6.constructors;

public class LearnConstructors {
	int x=1;
	public  LearnConstructors(){
		x=10;		
	}
	
	public LearnConstructors(int a){
		x=a;
	}
	public static void main(String[] args) {
		LearnConstructors l = new LearnConstructors();
		LearnConstructors l1 = new LearnConstructors(100);
		System.out.println(l.x);
		System.out.println(l1.x);
	}

}
