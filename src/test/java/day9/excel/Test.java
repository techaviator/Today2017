package day9.excel;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") +"/src/test/resources/Age.xlsx";
		ExcelReader xl = new ExcelReader(path);		
		
		for(int i= 1;i <=xl.getlastRownum("Sheet1");i++)
		{
			//System.out.println(xl.getCellValue("Sheet1",i,0));
			String age = xl.getCellValue("Sheet1",i,1);
			String age_int = age.replace(".0", "");
			if(Integer.parseInt(age_int) >17)
			{
				//xl.setCellValue("Sheet1", i, 2, "Major");
			}
			else{
				//xl.setCellValue("Sheet1", i, 2, "Minor");
			}
		}
		//xl.writeToExcel(path);
	}
}
