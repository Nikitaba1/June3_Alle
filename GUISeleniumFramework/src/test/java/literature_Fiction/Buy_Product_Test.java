package literature_Fiction;
/**
 * @author Nikitaba Parmar
 * 
 * Login, Click on Literature & Fiction Module buy one product and order it
 */

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Book_Discription_page;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Literature_and_Fiction_page;
import com.comcast.crm.objectrepositoryutility.Your_Cart_Page;

@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Buy_Product_Test extends BaseClass{
	
	@Test
	public void searchandBuy() {
		Home hp= new Home(driver);
		Literature_and_Fiction_page lf= new Literature_and_Fiction_page(driver);
		Book_Discription_page bdp= new Book_Discription_page(driver);
		WebDriverUtility wu= new WebDriverUtility();
		Your_Cart_Page cp= new Your_Cart_Page(driver);
		
		//Click on Literature and fiction link
		hp.getLiteratureFictionLink().click();
		
		//click on Asgwin sanghi's book
		lf.getAshwinSanghiBoxsetbooklink().click();
		
		//select Quenty in product discription page
		wu.select(bdp.getQuantityDropDown(), "2");
		
		//Click on add to cart button
		bdp.getAddToCartButton().click();
		
		//Click on place order button
		cp.place_Order.click();
		
		//handle the Order place successfull alert
		wu.switchtoAlertAndAccept(driver);
		
		
	}

}
