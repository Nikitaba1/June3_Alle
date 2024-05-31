package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Do_Some_Shopping {
	public Do_Some_Shopping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Do Some Shopping")
	public WebElement do_some_shopping;

}
