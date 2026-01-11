package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public static  String[][] readData() throws IOException {
		//open the WB
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		//Identify the Worksheet
		XSSFSheet ws = wb.getSheetAt(0);
		
		//rowCount
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//columnCount
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		
		String [][] data=new String[rowCount][columnCount];
		//entireData
		for (int i = 1; i <=rowCount ; i++) {
			
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue2);
				data[i-1][j]=stringCellValue2;
				
			}
			
		}
		wb.close();
		return data;

	}

}
