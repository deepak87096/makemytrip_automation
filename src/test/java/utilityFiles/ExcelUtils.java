package utilityFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
	public static void setCellData(String sheetName , int rowIdx , int colIdx ,String data) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\testData\\Cab_Booking_Data.xlsx" ;
		FileInputStream infile = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(infile);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		//XSSFRow row = sheet.createRow(rowIdx);
		XSSFRow row = null;
		if(sheet.getRow(rowIdx)==null) {
			row = sheet.createRow(rowIdx);
		}
		else {
			row = sheet.getRow(rowIdx);
		}
		XSSFCell cell = row.createCell(colIdx);
		cell.setCellValue(data);
	 
		FileOutputStream outfile = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\Cab_Booking_Data.xlsx");
		workbook.write(outfile);
		workbook.close();
		infile.close();
		outfile.close();		
	}
}
	
	
	


