package files.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException 
	{
		System.out.println(System.getProperty("user.dir"));  //Helpful when we make a framework 
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(1);
		HSSFCell cell= row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
		
		
		
		
		
		
		
	}

}
