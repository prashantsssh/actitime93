package _____practice_____;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ProgramFortyOne 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis= new FileInputStream("./testData/ExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(0);
		String customer2Name = cell.getStringCellValue();
		
		Cell cell1 = row.getCell(1);
		long customer2PhoneNo = (long) cell1.getNumericCellValue();
		
		Cell cell2 = row.getCell(3);
		boolean customerStatus = cell2.getBooleanCellValue();
		
		System.out.println("The name of second customer is->"+customer2Name);
		System.out.println("The phone number of second customer is->"+customer2PhoneNo);
		if(customerStatus)
		{
			System.out.println("He is passed.");
		}
		else
		{
			System.out.println("He is failed.");
		}
	}
}
