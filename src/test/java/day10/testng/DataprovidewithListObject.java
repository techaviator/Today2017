package day10.testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataprovidewithListObject {
	
	@DataProvider(name = "dp")
	public static Iterator<Object[]> setData(){
		List<Object[]> ls = new ArrayList<Object[]>();
		Object[] obj= new Object[2];
		obj[0] = "Sachin";
		obj[1]= "10000";
		ls.add(obj);
		obj=new Object[2];
		obj[0]="Tendulkar";
		obj[1] = "222222";
		ls.add(obj);
		return ls.iterator();
	}

}
