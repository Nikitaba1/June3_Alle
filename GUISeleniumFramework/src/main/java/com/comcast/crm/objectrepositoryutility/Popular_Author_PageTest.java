package com.comcast.crm.objectrepositoryutility;
/**
 * @author Nikitaba Parmar
 * 
 * Popular author's Pom page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popular_Author_PageTest {
	WebDriver driver;
	 public Popular_Author_PageTest(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath = "//img[@src='img/popular-author/0.jpg']")
	 private WebElement DurjoyDuttaimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/1.jpg']")
	 private WebElement ChetanBhagatimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/3.jpg']")
	 private WebElement DanBrownimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/4.jpg']")
	 private WebElement RavinderSingimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/5.jpg']")
	 private WebElement Jefferyimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/6.jpg']")
	 private WebElement  Salmanimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/7.jpg']")
	 private WebElement  JkRowlingimg;
	 
	 @FindBy(xpath = "//img[@src='img/popular-author/8.jpg']")
	 private WebElement  SubrataRoyimg;
	
	 @FindBy(xpath="//img[@src='img/books/LIT-1.jpg']")
	 private WebElement  ChetanBhagatCollectionBooklink;
	 
	 @FindBy(xpath="//img[@src='img/books/LIT-31.jpg']")
	 private WebElement  HarryPotterBooklink;
	 
	 
	public WebElement getHarryPotterBooklink() {
		return HarryPotterBooklink;
	}

	public WebElement getChetanBhagatCollectionBooklink() {
		return ChetanBhagatCollectionBooklink;
	}

	public WebElement getDurjoyDuttaimg() {
		return DurjoyDuttaimg;
	}

	public WebElement getChetanBhagatimg() {
		return ChetanBhagatimg;
	}

	public WebElement getDanBrownimg() {
		return DanBrownimg;
	}

	public WebElement getRavinderSingimg() {
		return RavinderSingimg;
	}

	public WebElement getJefferyimg() {
		return Jefferyimg;
	}

	public WebElement getSalmanimg() {
		return Salmanimg;
	}

	public WebElement getJkRowlingimg() {
		return JkRowlingimg;
	}

	public WebElement getSubrataRoyimg() {
		return SubrataRoyimg;
	}
	 
	
}
