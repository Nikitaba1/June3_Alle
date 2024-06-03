package entrance.Exam;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;

public class To_Search_For_BooksTest extends BaseClass{

	@Test
	
	public void to_Search_For_Books_Test(){
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.waitForPageToLoad(driver);
		Home home= new Home(driver);
		home.getEntranceExamLink().click();
		home.getSearchTextFiled().sendKeys("GK",Keys.ENTER);
		Entrance_Exam_Store ees = new Entrance_Exam_Store(driver);
		ees.getSearched_Book().click();
		Book_Discription_page bdp = new Book_Discription_page(driver);
		bdp.getAddToCartButton().click();
		Your_Cart_Page ycp= new Your_Cart_Page(driver);
		ycp.getPlace_Order().click();
		wdu.switchtoAlertAndAccept(driver);;
	}
}
