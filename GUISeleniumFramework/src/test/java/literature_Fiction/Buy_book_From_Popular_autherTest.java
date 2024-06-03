package literature_Fiction;
/**
 * @author Nikitaba Parmar
 * 
 * In this method selecting author and add it to the cart then remove it and contiue with shopping
 */

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Do_Some_Shopping;
import com.comcast.crm.objectrepositoryutility.Popular_Author_PageTest;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Buy_book_From_Popular_autherTest extends BaseClass{
	@Test
	public void popularAuthorBookTest() {
		
		WebDriverUtility wu = new WebDriverUtility();
		Popular_Author_PageTest pap= new Popular_Author_PageTest(driver);
		Book_Discription_page bdp = new Book_Discription_page(driver);
		Your_Cart_Page ycp = new Your_Cart_Page(driver);
		Do_Some_Shopping dss= new Do_Some_Shopping(driver);
		
		//wait statment
		wu.waitForPageToLoad(driver);
		
		//click on ChetanBhagat author image and select book
		pap.getChetanBhagatimg().click();
		pap.getChetanBhagatCollectionBooklink().click();
		
		//add to cart
		bdp.getAddToCartButton().click();
		
		//Remove Product from cart
		ycp.removebutton.click();
		wu.switchtoAlertAndAccept(driver);
		
		//Verification
		String actualdata = dss.getYourcartText().getText();
		String Expecteddata = "YOUR CART";
		Assert.assertEquals(actualdata, Expecteddata, "Cart is Empty");
		
		//Click on Do Some Shopping Button To continue shopping
		dss.do_some_shopping.click();
	}
}
