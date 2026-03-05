package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleRowsAndCells {

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("EmpData");
		//First Row
		XSSFRow row0=sheet1.createRow(0);
		XSSFCell cell00=row0.createCell(0);
		XSSFCell cell01=row0.createCell(1);
		XSSFCell cell02=row0.createCell(2);
		XSSFCell cell03=row0.createCell(3);
				
		cell00.setCellValue("EmpID");
		cell01.setCellValue("EmpName");
		cell02.setCellValue("EmpDept");
		cell03.setCellValue("EmpSal");
		
		//Second Row
		XSSFRow row1=sheet1.createRow(1);
		XSSFCell cell10=row1.createCell(0);
		XSSFCell cell11=row1.createCell(1);
		XSSFCell cell12=row1.createCell(2);
		XSSFCell cell13=row1.createCell(3);
		cell10.setCellValue("E101");
		cell11.setCellValue("John");
		cell12.setCellValue("IT");
		cell13.setCellValue(25000);
		
		//Third Row
		XSSFRow row2=sheet1.createRow(2);
		XSSFCell cell20=row2.createCell(0);
		XSSFCell cell21=row2.createCell(1);
		XSSFCell cell22=row2.createCell(2);
		XSSFCell cell23=row2.createCell(3);
		cell20.setCellValue("E102");
		cell21.setCellValue("Smith");
		cell22.setCellValue("HR");
		cell23.setCellValue(30000);
		
		//Forth Row
		XSSFRow row3=sheet1.createRow(3);
		XSSFCell cell30=row3.createCell(0);
		XSSFCell cell31=row3.createCell(1);
		XSSFCell cell32=row3.createCell(2);
		XSSFCell cell33=row3.createCell(3);
		cell30.setCellValue("E103");
		cell31.setCellValue("David");
		cell32.setCellValue("Finance");
		cell33.setCellValue(35000);
				
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\WriteDataMultipleRowsAndCells.xlsx");
		workbook.write(fileout);
		
		System.out.println("Data written successfully");
		workbook.close();

	}

}
