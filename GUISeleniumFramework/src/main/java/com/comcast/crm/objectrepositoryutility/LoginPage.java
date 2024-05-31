package com.comcast.crm.objectrepositoryutility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Nikitaba Parmar
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(name="login_username")                        
	private WebElement usernameEdt;
	
	@FindBy(name="login_password")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//button[@value='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "(//button[@type='button'and text()='Close'])[1]")
	private WebElement CloseBtn;     
	
	                                             
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getUsernameEdt() {           
		return usernameEdt;                        
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url http://49.249.28.218:8081/AppServer/Online_Book_Shop_System/
 * @param username suyesh
 * @param password gulati
 */
	 public void loginToapp(String url , String username , String password) {
		 waitForPageToLoad(driver);
		 driver.get(url);	
		// driver.manage().window().maximize();
		 usernameEdt.sendKeys(username);
		 passwordEdt.sendKeys(password);
		 loginBtn.click();
	 }
	
	
}
