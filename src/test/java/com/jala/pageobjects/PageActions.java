package com.jala.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions extends PageObjects {

	Logger log = Logger.getLogger("devpinoyLogger");

	public PageActions(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method is to login to the application
	 * 
	 * @author JALA Technologies
	 * @param ele
	 * @param msg
	 */
	public void logink(String username, String password) {

		
		
	}

	/**
	 * Method is to click on a web element
	 * 
	 * @author JALA Technologies
	 * @param ele
	 * @param msg
	 */
	public void click(WebElement ele, String msg) {
		System.out.println("In click method");
		ele.click();

	}

	/**
	 * Method is type text in the Text Box or Text Area Date: 11-Apr-2018
	 * 
	 * @param ele
	 * @param msg
	 */

	public void type(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);

	}
	
	/** Method is type text in the Text Box or Text Area Date: 11-Apr-2018
	 * 
	 * @param ele
	 * @param msg
	 */

	public void isElementPresent(WebElement ele, String msg) {
		

	}
	
	
	

}
