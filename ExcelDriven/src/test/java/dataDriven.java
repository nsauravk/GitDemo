import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C://Users//cdac//Desktop//demodata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		workbook.getNumberOfSheets()
		
		
		
		
		
		
				}

}
