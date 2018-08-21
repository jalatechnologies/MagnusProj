package com.jala.concepts;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.jala.pageobjects.PageActions;

public class Operations {

	WebDriver driver;
	public PageActions pageObj;
	public static String URL = "http://magnus2.jalatechnologies.com/";
	public static String driverPath = "D:\\seleniumStuff\\chromedriver.exe";
	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * Date:11-04-2018
	 * 
	 */

	@BeforeClass
	public void setUp() {
		System.out.println("Before Method ");

		try {
			System.out.println("launching chrome browser");

			// Set driver path
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();

			// Launching the application
			driver.get(URL);
			System.out.println("Application launched successfully");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	

}
