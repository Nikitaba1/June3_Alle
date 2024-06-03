package entrance.Exam;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Do_Some_Shopping;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;
/**@author Nadhiya
 * this Test case is used to test whether the user can able to continue shopping after remove the book
 */
public class To_Do_Some_Shopping_after_Removed_the_Book_Test extends BaseClass{
	@Test
	public void to_Do_Some_Shopping_After_Removed_The_Book_Test() {
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
		Do_Some_Shopping dss = new Do_Some_Shopping(driver);
		dss.do_some_shopping.click();
		
		
	}
}
