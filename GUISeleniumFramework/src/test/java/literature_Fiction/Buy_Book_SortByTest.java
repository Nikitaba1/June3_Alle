package literature_Fiction;
/**
 * @author Nikitaba Parmar
 * 
 * Navigated to the Literature and Fiction Book use Short by and Buy Book
 */

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Do_Some_Shopping;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Literature_and_Fiction_page;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Buy_Book_SortByTest extends BaseClass {
	@Test
	public void SortBy() {
		//object created
		Home hp= new Home(driver);
		Literature_and_Fiction_page lfp = new Literature_and_Fiction_page(driver);
		WebDriverUtility wu = new WebDriverUtility();
		Book_Discription_page bdp = new Book_Discription_page(driver);
		Your_Cart_Page ycp= new Your_Cart_Page(driver);
		Do_Some_Shopping dssp = new Do_Some_Shopping(driver);

		//Navigate to Literature & Fiction page
		hp.getLiteratureFictionLink().click();
		
		//sort the book as per Low to high price
		wu.selectDynamicValue(lfp.getSelectDropDown(), "price");
		
		//click on Love not for sale book
		lfp.getLoveNotforSalebooklink().click();
		
		//click on add to cart
		bdp.getAddToCartButton().click();
		
		//place the order
		ycp.getPlace_Order().click();
		
		//handle the alert
		wu.switchtoAlertAndAccept(driver);
		
		//verification
		String actual = dssp.getYourcartText().getText();
		Assert.assertEquals(actual, "YOUR CART", "Navigated to Your Cart page");
	}
}
