package com.comcast.crm.objectrepositoryutility;
/**
 * @author Nikitaba Parmar
 * 
 * Contains Literature and fiction page elements
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Literature_and_Fiction_page {
	public Literature_and_Fiction_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="select")                        
	private WebElement SelectDropDown;
	
	@FindBy(name="keyword")
	private WebElement searchEdt;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-1.jpg']")
	private WebElement ChetanBhagatCollectionbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-2.jpg']")
	private WebElement AshwinSanghiBoxsetbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-3.jpg']")
	private WebElement Tintinbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-4.jpg']")
	private WebElement FiftyShadesTrilogybooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-5.jpg']")
	private WebElement CodeRedbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-6.jpg']")
	private WebElement LoveNotforSalebooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-7.jpg']")
	private WebElement TenLoveStoriesbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-8.jpg']")
	private WebElement TwentyeightNightsbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-9.jpg']")
	private WebElement SpiderWebbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-10.jpg']")
	private WebElement MyDreamsbooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-11.jpg']")
	private WebElement TellMeAStorybooklink;
	
	@FindBy(xpath = "//img[@class='book block-center img-responsive'and @src='img/books/LIT-12.jpg']")
	private WebElement Watchmanbooklink;

	public WebElement getSelectDropDown() {
		return SelectDropDown;
	}

	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getChetanBhagatCollectionbooklink() {
		return ChetanBhagatCollectionbooklink;
	}

	public WebElement getAshwinSanghiBoxsetbooklink() {
		return AshwinSanghiBoxsetbooklink;
	}

	public WebElement getTintinbooklink() {
		return Tintinbooklink;
	}

	public WebElement getFiftyShadesTrilogybooklink() {
		return FiftyShadesTrilogybooklink;
	}

	public WebElement getCodeRedbooklink() {
		return CodeRedbooklink;
	}

	public WebElement getLoveNotforSalebooklink() {
		return LoveNotforSalebooklink;
	}

	public WebElement getTenLoveStoriesbooklink() {
		return TenLoveStoriesbooklink;
	}

	public WebElement getTwentyeightNightsbooklink() {
		return TwentyeightNightsbooklink;
	}

	public WebElement getSpiderWebbooklink() {
		return SpiderWebbooklink;
	}

	public WebElement getMyDreamsbooklink() {
		return MyDreamsbooklink;
	}

	public WebElement getTellMeAStorybooklink() {
		return TellMeAStorybooklink;
	}

	public WebElement getWatchmanbooklink() {
		return Watchmanbooklink;
	}
}
