package entrance.Exam;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;

public class To_Sortby_Books_Low_To_HighPrice_Test extends BaseClass {
	@Test
	public void to_sortby_books_Test() {
	WebDriverUtility wdu = new WebDriverUtility();
	wdu.waitForPageToLoad(driver);
	Home home= new Home(driver);
	home.getEntranceExamLink().click();
	Entrance_Exam_Store ees = new Entrance_Exam_Store(driver);
	wdu.select(ees.sortBy, "Low To High Price");
	ees.getGK().click();
	Book_Discription_page bdp = new Book_Discription_page(driver);
	bdp.getAddToCartButton().click();
	Your_Cart_Page ycp = new Your_Cart_Page(driver);
	ycp.place_Order.click();
	wdu.switchtoAlertAndAccept(driver);
	
	}
}
