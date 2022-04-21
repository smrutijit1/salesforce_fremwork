package com.salesforce.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {
WebDriver driver;

FileInputStream fis ;
Properties prop;

	public void open() {
		 driver = new ChromeDriver();
		try {
			
		fis = new FileInputStream("C:\\Users\\smrutijit\\OneDrive\\Desktop\\seprojects\\salesforce\\src\\main\\java\\com\\salesforce\\base\\ObjectRepository.Properties");
		prop = new Properties();
		prop.load(fis);
		
			
		} catch (Exception e) {
			
		} 
		 
		 
		 
		 
		 
		
	}

	public void url(String httpUrl) {
		driver.get("https://login.salesforce.com/");
		
	}

	public void input(String testData, String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
	}

	public void ckick(String objectName) {
	    driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public void inputbyname(String testData, String objectName) {
		driver.findElement(By.name(prop.getProperty(objectName))).sendKeys(testData);
		
	}
	

}
