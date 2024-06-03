package literature_Fiction;
/**
 * @author Nikitaba Parmar
 * 
 * Raise the Query
 */
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AskQuery_page;
import com.comcast.crm.objectrepositoryutility.Home;

@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Raise_QueryTest extends BaseClass {
	@Test
	public void raiseQueryTest() throws Throwable {
		Home hp = new Home(driver);
		AskQuery_page ap= new AskQuery_page(driver);
		ExcelUtility eu = new ExcelUtility();
		WebDriverUtility wp= new WebDriverUtility();
		
		//click on Ask Query button
		hp.getQuerybutton().click();
		
		//reading data from excel
		String name = eu.getDataFromExcel("Query", 1, 0);
		String email = eu.getDataFromExcel("Query", 1, 1);
		String massage = eu.getDataFromExcel("Query", 1, 2);
		
		//Enter the name in query
		ap.getNametxtField().sendKeys(name);
		
		//Enter the Email in query
		ap.getEmailTextFeild().sendKeys(email);
		
		//Enter the Massage in query
		ap.getMessageBody().sendKeys(massage);
		ap.getSendQuery().click();
		
		//handle alert
		String Succesfulmsg = driver.switchTo().alert().getText();	
		System.out.println(Succesfulmsg);
		wp.switchtoAlertAndAccept(driver);
		String msg= "Your Message has been successfully sent! Our customer executive would respond shortly.";
		Assert.assertEquals(Succesfulmsg, msg,"Query raised");
		//Assert.assertTrue(true, "Query raised");	
	}
}
