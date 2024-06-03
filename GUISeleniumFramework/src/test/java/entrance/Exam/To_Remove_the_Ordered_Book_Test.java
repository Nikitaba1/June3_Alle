package entrance.Exam;


import org.testng.Assert;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;

public class To_Remove_the_Ordered_Book_Test extends BaseClass{
	@org.testng.annotations.Test
	public void to_Remove_the_Ordered_Book_Test() {
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
		ycp.getRemovebutton().click();
		String confirmmsg=wdu.switchtoAlertAndGetText(driver);
		System.out.println(confirmmsg);
		wdu.switchtoAlertAndAccept(driver);
	}
	

}
