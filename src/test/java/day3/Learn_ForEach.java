package day3;

import java.util.ArrayList;
import java.util.List;

public class Learn_ForEach {
	
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("x");
		ls.add("apple");
		ls.add("y");
		ls.add("orange");
		ls.add("w");
		
		for(String s:ls)
		{
			System.out.println(s);
		}
	}

}
