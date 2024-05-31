package com.comcast.crm.objectrepositoryutility;
/**
 * @author Nikitaba Parmar
 * 
 * Contains Books Discription page elements
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Discription_page {
	public Book_Discription_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="quantity")
	private WebElement QuantityDropDown;
	
	@FindBy(id="buyLink")
	private WebElement AddToCartButton;

	public WebElement getQuantityDropDown() {
		return QuantityDropDown;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
}
