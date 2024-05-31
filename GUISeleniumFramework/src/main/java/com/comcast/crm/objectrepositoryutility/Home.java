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
 * Contains Home page elements & business lib like login()
 *
 */  
public class Home extends WebDriverUtility{                             
                           
	WebDriver driver;
	 public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id = "register_button")
	 private WebElement signupLink;
	 
	 @FindBy(id = "login_button")
	 private WebElement LoginLink;
	 
	 @FindBy(partialLinkText  = "LogOut")
	 private WebElement LogoutLink;
	 
	 @FindBy(partialLinkText  = "Cart")
	 private WebElement CartLink;
	 
	 @FindBy(name  = "keyword")
	 private WebElement SearchTextFiled;
	 
	 @FindBy(partialLinkText  = "Entrance Exam")
	 private WebElement  EntranceExamLink;
	 
	 @FindBy(partialLinkText  = "Literature & Fiction")
	 private WebElement  LiteratureFictionLink;
	 
	 @FindBy(partialLinkText  = "Academic & Professional")
	 private WebElement  AcademicProfessionalLink;
	 
	 @FindBy(partialLinkText  = "Biographies & Auto Biographies")
	 private WebElement  BiographiesAutoBiographiesLink;
	 
	 @FindBy(partialLinkText  = "Children & Teens")
	 private WebElement  ChildrenTeensLink;
	 
	 @FindBy(partialLinkText  = "Regional Books")
	 private WebElement   RegionalBooksLink;
	 
	 @FindBy(partialLinkText  = "Business & Management")
	 private WebElement   BusinesManagementLink;
	 
	 @FindBy(partialLinkText  = "Health and Cooking")
	 private WebElement   HealthandCookingLink;
	 
	 @FindBy(xpath  = "//button[@id='query_button']")
	 private WebElement  querybutton;
	 
	 @FindBy(xpath  = "//img[@title='Twitter']")
	 private WebElement  TwitterLink;
	 
	 @FindBy(xpath  = "//button[@title='LinkedIn']")
	 private WebElement  LinkedInLink;
	 
	 @FindBy(xpath  = "//button[@title='Facebook']")
	 private WebElement  FacebookLink;
	 
	 @FindBy(xpath  = "//button[@title='google+']")
	 private WebElement  GoogleLink;
	 
	 @FindBy(xpath  = "//button[@title='Pinterest']")
	 private WebElement  PinterestLink;
	 
	public WebElement getSignupLink() {
		return signupLink;
	}


	public WebElement getLoginLink() {
		return LoginLink;
	}


	public WebElement getLogoutLink() {
		return LogoutLink;
	}


	public WebElement getCartLink() {
		return CartLink;
	}


	public WebElement getSearchTextFiled() {
		return SearchTextFiled;
	}


	public WebElement getEntranceExamLink() {
		return EntranceExamLink;
	}


	public WebElement getLiteratureFictionLink() {
		return LiteratureFictionLink;
	}


	public WebElement getAcademicProfessionalLink() {
		return AcademicProfessionalLink;
	}


	public WebElement getBiographiesAutoBiographiesLink() {
		return BiographiesAutoBiographiesLink;
	}


	public WebElement getChildrenTeensLink() {
		return ChildrenTeensLink;
	}


	public WebElement getRegionalBooksLink() {
		return RegionalBooksLink;
	}


	public WebElement getBusinesManagementLink() {
		return BusinesManagementLink;
	}


	public WebElement getHealthandCookingLink() {
		return HealthandCookingLink;
	}


	public WebElement getQuerybutton() {
		return querybutton;
	}


	public WebElement getTwitterLink() {
		return TwitterLink;
	}


	public WebElement getLinkedInLink() {
		return LinkedInLink;
	}


	public WebElement getFacebookLink() {
		return FacebookLink;
	}


	public WebElement getGoogleLink() {
		return GoogleLink;
	}


	public WebElement getPinterestLink() {
		return PinterestLink;
	}
	
}
