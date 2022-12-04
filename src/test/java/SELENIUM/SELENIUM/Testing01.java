package SELENIUM.SELENIUM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testing01 {
	
	public static XSSFWorkbook xs;
	
	public static void main(String [] args) throws IOException
	{
		String path = "C:\\Users\\chinn\\OneDrive\\Documents\\Test1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		xs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheetAt(0);
		System.out.println(sheet.getSheetName());
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	}
	

}
