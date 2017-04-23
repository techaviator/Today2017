package day4.strings;

public class LearningStrings {
	
	String name="Jim";
	
/*	String name;*/
public void addName()
{
	name="Immanuel";
}
	public static void main(String[] args) {
		LearningStrings learningStrings = new LearningStrings();
		System.out.println(learningStrings.name);
		learningStrings.addName();
		System.out.println(learningStrings.name);
		
	}

}
