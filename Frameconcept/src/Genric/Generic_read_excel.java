package Genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_read_excel {
	public static String getData(String sheet,int row,int cell)
	{
		String val="";
		try {
			FileInputStream fis=new FileInputStream("./excel/Frame.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
        	Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
        	val=c.getStringCellValue();
		}
		
		catch (Exception e) {
			System.out.println("unable to fetch the data");
		}
		return val;
	}

}
