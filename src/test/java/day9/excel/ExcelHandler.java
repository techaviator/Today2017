package day9.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") +"/src/test/resources/Age.xlsx";
		FileInputStream fis = null;
				fis =new FileInputStream(path);
				if(fis !=null)
				{
					System.out.println("Connection Successfull");
				}
				
				XSSFWorkbook wb	= new XSSFWorkbook(fis);
				fis.close();
				
				String result = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
				System.out.println(result);
				
				double numericCellValue = wb.getSheet("Sheet1").getRow(5).getCell(1).getNumericCellValue();
				System.out.println(numericCellValue);
				
				wb.getSheet("Sheet1").getRow(1).getCell(2).setCellValue("Major");
				
				//GET the number of rows
				int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
				System.out.println(lastRowNum);
				//get the number of cells
				short lastCellNum = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
				System.out.println(lastCellNum);
				FileOutputStream fout = new FileOutputStream(path);
				wb.write(fout);
				fout.close();
				wb.close();
	}

}
