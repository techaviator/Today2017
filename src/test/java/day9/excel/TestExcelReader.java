package day9.excel;

import java.io.IOException;

public class TestExcelReader {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") +"/src/test/resources/Age.xlsx";
		ExcelReader xl = new ExcelReader(path);		
		int getlastRownum = xl.getlastRownum("Sheet1");
		System.out.println(getlastRownum);
		
		for(int i= 13;i <=getlastRownum+12;i++)
		{
		
			//System.out.println(xl.getCellValue("Sheet1",i,0));
			String age = xl.getCellValue("Sheet1",i-12,1);
			String age_int = age.replace(".0", "");
			if(Integer.parseInt(age_int) >17)
			{
				xl.setCellValue("Sheet1", i, 4, "Major");
			}
			else{
				xl.setCellValue("Sheet1", i, 4, "Minor");
			}
		}
		xl.writeToExcel(path);
	}

}
