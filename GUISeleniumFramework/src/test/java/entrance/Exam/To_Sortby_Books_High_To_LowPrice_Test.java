package entrance.Exam;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;

public class To_Sortby_Books_High_To_LowPrice_Test extends BaseClass{
	@Test
	public void to_sortby_books_high_to_lowPrice_Test() {
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.waitForPageToLoad(driver);
		Home home = new Home(driver);
		home.getEntranceExamLink().click();
		Entrance_Exam_Store ees= new Entrance_Exam_Store(driver);
		wdu.select(ees.sortBy, "Highest To Lowest Price");
		ees.ele_Indian_Polity.click();
		Book_Discription_page bdp = new Book_Discription_page(driver);
		wdu.select(bdp.getQuantityDropDown(),"2");
		bdp.getAddToCartButton().click();
		Your_Cart_Page ycp = new Your_Cart_Page(driver);
		ycp.place_Order.click();
		wdu.switchtoAlertAndAccept(driver);
				
		
	}
}
