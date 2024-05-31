package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entrance_Exam {
public Entrance_Exam(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Entrance Exam")
public WebElement entranceExamLink;

public WebElement getEntranceExamLink() {
	return entranceExamLink;
}

}
