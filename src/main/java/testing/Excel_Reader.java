package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	
	
	public static void main(String[] args) throws IOException  {

		File f = new File("D:\\Automation Testing\\Eclips\\Automation_Start_1\\target\\My Preparation_Automation.xlsx");
		boolean a = f.exists();

		System.out.println(a);
		

		FileInputStream fis = new FileInputStream(f);

		// how to load whole workbook
		// we need apache poi dependeancy.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// there are 2 types of xls sheet
		// .xls HSSFWorkbook workbook = new HSSFWorkbook(fis);
		// .xlsx XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// if u want to focus on specific sheet
		XSSFSheet sheets = workbook.getSheetAt(0);

		String b = sheets.getRow(0).getCell(0).getStringCellValue();
		System.out.println(b);


}}
