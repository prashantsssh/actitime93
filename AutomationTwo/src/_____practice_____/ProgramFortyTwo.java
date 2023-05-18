package _____practice_____;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ProgramFortyTwo 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis= new FileInputStream("./testData/ExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(7);
		Cell cell = row.createCell(0);
		cell.setCellValue("Dr.Strange");
		
		sheet.createRow(8).createCell(0).setCellValue("Hulk");
		
		FileOutputStream fos= new FileOutputStream("./testData/ExcelData.xlsx");
		workbook.write(fos);
		workbook.close();
	}
}
