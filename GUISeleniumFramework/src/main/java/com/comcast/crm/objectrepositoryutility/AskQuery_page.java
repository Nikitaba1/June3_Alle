package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AskQuery_page 
{
	WebDriver driver;
	public AskQuery_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="query_button")
	private WebElement AskQueryButton;
	@FindBy(name="sender")
	private WebElement nametxtField;
	@FindBy(name="senderEmail")
	private WebElement emailTextFeild;
	@FindBy(name="message")
	private WebElement messageBody;
	@FindBy(name="submit")
	private WebElement sendQuery;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAskQueryButton() {
		return AskQueryButton;
	}
	public WebElement getNametxtField() {
		return nametxtField;
	}
	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}
	public WebElement getMessageBody() {
		return messageBody;
	}
	public WebElement getSendQuery() {
		return sendQuery;
	}
			
	public void askQuery(String name, String email, String body)
	{
		getAskQueryButton().click();
		getNametxtField().sendKeys(name);
		getEmailTextFeild().sendKeys(email);
		getMessageBody().sendKeys(body);
		getSendQuery().click();
	}
	
	
	
	
	
}
