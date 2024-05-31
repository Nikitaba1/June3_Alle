package com.comcast.crm.objectrepositoryutility;
/**
 * @author Vivek kumar
 * Academic And Professional Page Project object model
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicAndProfessional_Page {
	WebDriver driver;

	public AcademicAndProfessional_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "keyword")
	private WebElement searchTxtField;

	@FindBy(id = "select")
	private WebElement sortBySelect;

	public WebElement getSearchTxtField() {
		return searchTxtField;
	}

	public WebElement getSortBySelect() {
		return sortBySelect;
	}
	//Academic And Professional Books
	
	@FindBy(xpath = "//img[@class=\"book block-center img-responsive\" and @src=\"img/books/ACA-1.jpg\"]")
	private WebElement codingForDummyBook;
	@FindBy(xpath = "//img[@class=\"book block-center img-responsive\" and @src=\"img/books/ACA-2.jpg\"]")
	private WebElement whatNextBook;
	@FindBy(xpath = "//img[@class=\"book block-center img-responsive\" and @src=\"img/books/ACA-3.jpg\"]")
	private WebElement IitFoundationBook;
	@FindBy(xpath = "//img[@class=\"book block-center img-responsive\" and @src=\"img/books/ACA-4.jpg\"]")
	private WebElement researchAnlyticBook;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCodingForDummyBook() {
		return codingForDummyBook;
	}

	public WebElement getWhatNextBook() {
		return whatNextBook;
	}

	public WebElement getIitFoundationBook() {
		return IitFoundationBook;
	}

	public WebElement getResearchAnlyticBook() {
		return researchAnlyticBook;
	}
	
	

}
