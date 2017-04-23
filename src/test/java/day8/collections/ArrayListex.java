package day8.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListex {
	
	public static void main(String[] args) {
		//ArrayList<String> ls = new ArrayList<String>();
		List<String> ls = new ArrayList<String>();
		
		ls.add("apple");
		ls.add("Orange");
		ls.add("pineapple");
		ls.add("apple");
		ls.add("grape");
		ls.add(null);
		ls.add(null);
		ls.add("lemon");
		
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.get(2));
		ls.add(2, "pappaya");
		System.out.println(ls);
		
		/*for(String s : ls)
		{
			//System.out.println(s);
			if(s!=null&&s.equalsIgnoreCase("pappaya"))
			{
				System.out.println(s);
			}
		}*/
		
		Iterator<String> iterator = ls.iterator();
		
		while(iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println(next);
			if(next!=null&&next.equalsIgnoreCase("pappaya")){
				iterator.remove();
			}
			//System.out.println(iterator.next());
		}
		System.out.println(ls);
	}

}
