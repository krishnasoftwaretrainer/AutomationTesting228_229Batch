package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_MultipleCells {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filein = new FileInputStream(
				"D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\SwagLoginTestData.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(filein);
	XSSFSheet sheet1=workbook.getSheetAt(0);
	
	
	for(int r=0;r<=sheet1.getLastRowNum();r++)  //0<2 1<2 2<2 F 4 Soft Code
	//for(int r=0;r<4;r++) //Hard coded value
	{
		XSSFRow row=sheet1.getRow(r); //0 1 2 3
		
		for(int c=0;c<row.getLastCellNum();c++)  //5 2
		//for(int c=0;c<2;c++)  //Hard coded value
		{
			String celldata=row.getCell(c).getStringCellValue();//00 01 02 03 10 11 12 13
			System.out.print(celldata+" || ");
		}
		System.out.println();
	}
		
		
	}

}
