package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleCellsSingleRow {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("EmpData");
		
		XSSFRow row=sheet1.createRow(0);
		XSSFCell cell0=row.createCell(0);
		XSSFCell cell1=row.createCell(1);
		XSSFCell cell2=row.createCell(2);
		XSSFCell cell3=row.createCell(3);
				
		cell0.setCellValue("EmpID");
		cell1.setCellValue("EmpName");
		cell2.setCellValue("EmpDept");
		cell3.setCellValue("EmpSal");
		
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\WriteDataMultipleCellsSingleRow.xlsx");
		workbook.write(fileout);
		
		System.out.println("Data written successfully");
		workbook.close();

	}

}
