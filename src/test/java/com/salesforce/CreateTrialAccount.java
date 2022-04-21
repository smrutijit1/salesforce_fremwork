package com.salesforce;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.salesforce.base.ExcelReader;
import com.salesforce.base.keywords;

public class CreateTrialAccount {
	
	@Test
	public void loginTest() {
		ArrayList data = ExcelReader.getData("D:/LogintestSuite.xlsx");
		keywords key = new keywords();
		
		for (int i = 0; i < data.size(); i++) {
		if(data.get(i).equals("open")) {
			key.open();
		}
		
	if(data.get(i).equals("url"))	{
		String httpurl = data.get(i+1).toString();
		key.url(httpurl);
		
		
	}
	if(data.get(i).equals("input"))	{
		String testData = data.get(i+1).toString();
		String objectName = data.get(i+2).toString();
		key.input(testData,objectName);
			
			
				
			}
	
	
	if(data.get(i).equals("click"))	{
		String testData = data.get(i+1).toString();
		String objectName = data.get(i+2).toString();
		key.ckick(objectName);
	
	
	
	
	
		}
		
	
	if(data.get(i).equals("inputbyname"))	{
		String  testData = data.get(i+1).toString();
		String objectName = data.get(i+2).toString();
		key.inputbyname(testData,objectName);

	
	}
	
}

}
}