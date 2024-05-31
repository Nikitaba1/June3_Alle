package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Nadhiya
 * this Your cart page contains the elements, Place Order, Continue shopping and ordered book details.
 */

public class Your_Cart_Page {
	public Your_Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Place Order")
	public WebElement place_Order;
	@FindBy(linkText = "Continue Shopping")
	public WebElement continue_Shopping;

}
