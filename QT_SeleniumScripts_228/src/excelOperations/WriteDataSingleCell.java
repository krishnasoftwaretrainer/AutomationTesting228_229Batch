package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataSingleCell {

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("EmpData");
		
		XSSFRow row=sheet1.createRow(3);
		XSSFCell cell=row.createCell(3);
		cell.setCellValue("Hai");
		
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\WriteDataSingleCell.xlsx");
		workbook.write(fileout);
		
		System.out.println("Data written successfully");
		workbook.close();
		

	}

}
