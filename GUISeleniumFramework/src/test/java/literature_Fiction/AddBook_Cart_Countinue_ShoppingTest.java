package literature_Fiction;
/**
 * @author Nikitaba parmar
 * 
 * Add Book in cart then countinue shopping
 */

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Literature_and_Fiction_page;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class AddBook_Cart_Countinue_ShoppingTest extends BaseClass {
	@Test
	public void countinueShoppingTest() {
		//Created Object
		Home hp = new Home(driver);
		Literature_and_Fiction_page lfp = new Literature_and_Fiction_page(driver);
		Book_Discription_page bdp= new Book_Discription_page(driver);
		Your_Cart_Page ycp = new Your_Cart_Page(driver);
		
		
		//add book into cart
		hp.getLiteratureFictionLink().click();
		lfp.getMyDreamsbooklink().click();
		bdp.getAddToCartButton().click();
		
		//countinue shopping
		ycp.getContinue_Shopping().click();
		
		//verification
		String acturl = driver.getCurrentUrl();
		String expectedurl = "http://49.249.28.218:8081/AppServer/Online_Book_Shop_System/index.php";
		Assert.assertEquals(acturl, expectedurl, "Home page is displayed");
	}
}
