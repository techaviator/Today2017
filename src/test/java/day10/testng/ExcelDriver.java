package day10.testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelDriver {
	
	public static List<Object[]> driverExcelData() throws IOException {
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Bing.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int getlastRownum = xl.getlastRownum("Bing");
		int lastCellNumber = xl.getLastCellNumber("Bing", 0);
		Map<String,String> map = null;
		Object[] obj = null;
		List<Object[]> ls = new ArrayList<Object[]>();
		for(int i= 1;i<=getlastRownum;i++)
		{			
			obj = new Object[1];
			map = new HashMap<String, String>();
			for(int j=0;j<lastCellNumber;j++){
				map.put(xl.getCellValue("Bing", 0, j), xl.getCellValue("Bing", i, j));
						
			}
			obj[0] = map;
			ls.add(obj);
		}
		
		return ls;
	}

}
