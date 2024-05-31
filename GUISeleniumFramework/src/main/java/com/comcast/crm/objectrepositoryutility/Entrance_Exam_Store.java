package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entrance_Exam_Store {
	public Entrance_Exam_Store(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="select")
	public WebElement sortBy;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-1.jpg']")
	public WebElement ele_TIE;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-2.jpg']")
	public WebElement ele_GK;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-3.jpg']")
	public WebElement ele_SSC_QuestionBank;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-4.jpg']")
	public WebElement ele_CMC;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-5.jpg']")
	public WebElement ele_IIM_Indore_IPM;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-6.jpg']")
	public WebElement ele_Marketing_Management;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-7.jpg']")
	public WebElement ele_The_Mega_Year_Book;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-8.jpg']")
	public WebElement ele_Indian_Polity;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-9.jpg']")
	public WebElement ele_RRB;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-10.jpg']")
	public WebElement ele_General_Studies;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-11.jpg']")
	public WebElement ele_Mechanical_Eng;
	@FindBy(xpath = "//img[@class='book block-center img-responsive' and @src='img/books/ENT-12.jpg']")
	public WebElement ele_Mechanical_Eng_Paper2;
	
	public WebElement getMechanical_Eng_Paper2() {
		return ele_Mechanical_Eng_Paper2;
	}
	
	public WebElement getSortBy() {
		return sortBy;
	}
	public WebElement getTIE() {
		return ele_TIE;
	}
	public WebElement getGK() {
		return ele_GK;
	}
	public WebElement getSSC_QuestionBank() {
		return ele_SSC_QuestionBank;
	}
	public WebElement getCMC() {
		return ele_CMC;
	}
	public WebElement getIIM_Indore_IPM() {
		return ele_IIM_Indore_IPM;
	}
	public WebElement getMarketing_Management() {
		return ele_Marketing_Management;
	}
	public WebElement getThe_Mega_Year_Book() {
		return ele_The_Mega_Year_Book;
	}
	public WebElement getIndian_Polity() {
		return ele_Indian_Polity;
	}
	public WebElement getRRB() {
		return ele_RRB;
	}
	public WebElement getGeneral_Studies() {
		return ele_General_Studies;
	}
	public WebElement getMechanical_Eng() {
		return ele_Mechanical_Eng;
	}
	
	
	
}
