package excelfilemanupluation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("D:\\testing1.xls");
	HSSFWorkbook wb =new HSSFWorkbook(file);
	HSSFSheet sheet= wb.getSheet("jyoti");
	HSSFRow row= sheet.getRow(0);
	HSSFCell cell=row.getCell(0);
	String data=cell.getStringCellValue();
	System.out.println(data);
	
	}

}
