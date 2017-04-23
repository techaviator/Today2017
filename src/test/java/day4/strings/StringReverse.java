package day4.strings;

public class StringReverse {
	static String name="Preeti";
	public static void main(String[] args) {
		//name="Kumar";
		System.out.println(name);
		System.out.println(name.length());
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
