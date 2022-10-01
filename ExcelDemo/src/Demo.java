import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\Amit Saini\\Documents\\Demo.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String data = WorkbookFactory.create(file).getSheet("Test").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		Sheet s = WorkbookFactory.create(file).getSheet("Test");
		
		int lastRowmo = s.getLastRowNum();
		
		Row r = s.getRow(lastRowmo);
		
		int lastCell = r.getLastCellNum();
		
//		Cell c = ();
		
		System.out.println(lastRowmo);
		
	

	}
}
