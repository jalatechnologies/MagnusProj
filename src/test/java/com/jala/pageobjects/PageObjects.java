package com.jala.pageobjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");

	public PageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Admin Login Page

	@FindBy(partialLinkText = "Admin")
	public WebElement admin_link;

	@FindBy(id = "txtname")
	public WebElement admin_login_username_txt;

	@FindBy(id = "txtpsw")
	public WebElement admin_login_password_txt;

	@FindBy(id = "btnlogin")
	public WebElement admin_login_button;
	
	
	
	
}
