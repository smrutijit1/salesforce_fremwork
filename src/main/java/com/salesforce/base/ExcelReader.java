package com.salesforce.base;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public  static ArrayList getData(String filePath) {
		
		ArrayList data = new ArrayList();
	try {	
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
         Iterator<Row> iterator = sheet.iterator();//row
         while(iterator.hasNext()) {
         Row row = iterator.next();
         
         Iterator<Cell> cellIterator = row.cellIterator();//col
         while(cellIterator.hasNext()) {
        	 Cell cell = cellIterator.next() ;
        	 
        	 data.add(cell.getStringCellValue());
         }
         
        	 
        	 
        	
        	
        }
        	
        
        	 
        	 
        	 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
			
			
			
		
			

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	return data;	
	
				
	} catch (Exception e) {
		e.printStackTrace();
	}	
		
	return null;	
		
		
		
		
	
	

}

	
	
}


