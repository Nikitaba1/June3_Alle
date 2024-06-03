package entrance.Exam;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Directly_Select_Book_and_Place_Order_Test extends BaseClass{
	@Test
	public void directly_Select_Book_And_Place_Order_Test() {
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.waitForPageToLoad(driver);
		Home home = new Home(driver);
		home.getEntranceExamLink().click();
		Entrance_Exam_Store ees = new Entrance_Exam_Store(driver);
		wdu.mousemoveOnElement(driver, ees.ele_Mechanical_Eng_Paper2);
		ees.ele_Mechanical_Eng_Paper2.click();
		Book_Discription_page bdp = new Book_Discription_page(driver);
		wdu.select(bdp.getQuantityDropDown(), "2");
		bdp.getAddToCartButton().click();
		Your_Cart_Page ycp = new Your_Cart_Page(driver);
		String title=ycp.Order_Title.getText();
		Assert.assertEquals(title, "Order 1", "Order Created Successfully");
		ycp.place_Order.click();
		//wdu.switchtoAlertAndAccept(driver);
		
		
	}
}
