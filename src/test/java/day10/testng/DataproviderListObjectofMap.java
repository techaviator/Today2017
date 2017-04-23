package day10.testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class DataproviderListObjectofMap {
	
	/*@DataProvider(name = "dp")
	public static Iterator<Object[]> setData(){
		List<Object[]> ls = new ArrayList<Object[]>();
		Object[] obj = new Object[1];
		Map<String,String> map  = new HashMap<String,String>();
		map.put("searchkey", "Sachin");
		map.put("expected", "1000000");
		obj[0] = map;
		ls.add(obj);		
		obj = new Object[1];
		map = new HashMap<String, String>();
		map.put("searchkey", "Tendulkar");
		map.put("expected", "2222222");
		obj[0] = map;
		ls.add(obj);
		return ls.iterator();
	}*/
	
	@DataProvider(name = "dp")
	public static Iterator<Object[]> setData() throws IOException{
		List<Object[]> ls = ExcelDriver.driverExcelData();
		return ls.iterator();
	}

}





