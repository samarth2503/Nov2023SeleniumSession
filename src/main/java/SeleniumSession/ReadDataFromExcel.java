package SeleniumSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args)
	{
		readDataFromExcelasMap();
		
//		String testdata = "C:\\Users\\samarjain\\Desktop\\CreateBooking.xlsx";
//		
//		String sheetName = "Sheet1";
//		
//		FileInputStream file = null;
//		try {
//			File f = new File(testdata);
//			file = new FileInputStream(f);
//			Workbook wb = WorkbookFactory.create(file);
//			
//			Sheet sheet = wb.getSheet("Sheet1");
//			
//			Object[][] data = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
//			
//			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
//			{
//				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++)
//				{
//					data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
//				}
//			}
//			
//			System.out.println(data);
//			
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (EncryptedDocumentException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				file.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
	
	public static void readDataFromExcelasMap()
	{
		String path = "C:\\Users\\samarjain\\Desktop\\CreateBooking.xlsx";
		String sheet = "Sheet1";
		
		File f = null;
		Object[][] obj = null;
				
		Map<String,Object> hm = null;
		
		FileInputStream fs = null;
		
		try {
			f = new File(path);
			fs = new FileInputStream(f);
			try {
				Workbook wb = WorkbookFactory.create(fs);
				
				Sheet sh = wb.getSheet(sheet);
				int row = sh.getPhysicalNumberOfRows();
				obj = new Object[row][1];
				
				for(int i=1;i<row;i++)
				{
					hm = new HashMap<String,Object>();
					for(int j=0;j<sh.getRow(0).getPhysicalNumberOfCells();j++)
					{
						hm.put(sh.getRow(0).getCell(j).getStringCellValue(), sh.getRow(i).getCell(j));
					}
					
					obj[i-1][0] = hm; 
				}
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.toString());
		
	}

}
