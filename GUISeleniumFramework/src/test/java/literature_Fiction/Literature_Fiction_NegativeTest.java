package literature_Fiction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.Home;
/**
 * @author Nikitaba Parmar
 * 
 * Try to fing Biographies book in Literature & Fiction(Nagative Test case)
 */
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Literature_Fiction_NegativeTest extends BaseClass {
	@Test
	public void NegativTest() {
		Home hp= new Home(driver);
		
		//Try to fing Biographies book in Literature & Fiction
		hp.getLiteratureFictionLink().click();
		hp.getSearchTextFiled().sendKeys("The Z Factor",Keys.ENTER);
		String actheader = driver.findElement(By.id("heading")).getText();
		Assert.assertEquals(actheader, "FOUND 1 RECORDS", "Nagative test case is passed");
	}
}
