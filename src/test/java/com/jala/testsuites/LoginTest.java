package com.jala.testsuites;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.pageobjects.PageActions;

/**
 * 
 * @author JALA Technologies
 *
 */

public class LoginTest {

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

			// Page Object initilization
			pageObj = new PageActions(driver);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @throws Exception
	 */

	@Test
	public void loginAdmin() throws Exception {
		try {

			log.info("*************** Entering login Admin**************");
			System.out.println("First Test ................");
			pageObj.click(pageObj.admin_link, " Admin link");
			pageObj.type(pageObj.admin_login_username_txt, "admin");
			pageObj.type(pageObj.admin_login_password_txt, "admin");
			pageObj.click(pageObj.admin_login_button, "Clicking the Login button");
			
			log.info("*************** leaving login Admin**************");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
