package extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromXLFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		step 1> get the java representation object of the physical file
//		/vtiger-crm-framework-m5/src/test/resources/testScriptData.xlsx
//		modified to
//		./src/test/resources/testScriptData.xlsx
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");

//		step 2> get the access of workbook
		Workbook wb = WorkbookFactory.create(fis);

//		step 3> get the access of sheet
		Sheet sheet = wb.getSheet("dummy");

//		step 4> get the access of row
		Row row = sheet.getRow(7);

//		step 5> get the access of cell
		Cell cell = row.getCell(0);

//		step 6> get the data
		String data = cell.getStringCellValue();
//		cell.getNumericCellValue();
//		cell.getBooleanCellValue();
		System.out.println(data);

		wb.close();

	}
}
