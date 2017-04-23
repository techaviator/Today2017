package day8.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetex {
	
	public static void main(String[] args) {
		//LinkedHashSet<String> ls = new LinkedHashSet<String>();
		Set<String> ls = new LinkedHashSet<String>();
				
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
			
				
				System.out.println(ls);
				
				for(String s : ls)
				{
					//System.out.println(s);
					if(s!=null&&s.equalsIgnoreCase("pappaya"))
					{
						System.out.println(s);
					}
				}
				
				Iterator<String> iterator = ls.iterator();
				
			/*	while(iterator.hasNext())
				{
					String next = iterator.next();
					System.out.println(next);
					if(next!=null&&next.equalsIgnoreCase("pappaya")){
						iterator.remove();
					}
					//System.out.println(iterator.next());
				}
				System.out.println(ls);*/
			}

}
