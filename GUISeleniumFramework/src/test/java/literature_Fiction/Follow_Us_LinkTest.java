package literature_Fiction;
/**
 * @author Nikitaba Parmar
 * 
 * Checking all the follow us links 
 */

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Home;
@Listeners(com.comcast.crm.generic.listenerutility.Listeners_Implimentation.class)
public class Follow_Us_LinkTest extends BaseClass {
	
	@Test
	public void checkEachLink() throws Exception {
		
		Home hp= new Home(driver);
		WebDriverUtility wu= new WebDriverUtility();
		
		//Wait statment
		wu.waitForPageToLoad(driver);
		
		//Click on Twitter link
		hp.getTwitterLink().click();
		wu.navigationBack(driver);
		wu.navigationRefresh(driver);
		wu.switchtoAlertAndAccept(driver);
		Reporter.log("Twitter link is working");
		
		//Click on Linked in link
		hp.getLinkedInLink().click();
		wu.navigationBack(driver);
		wu.navigationRefresh(driver);
		wu.switchtoAlertAndAccept(driver);
		Reporter.log("Linked link is working");
		
		//Click on FaceBook link
		hp.getFacebookLink().click();
		wu.navigationBack(driver);
		wu.navigationRefresh(driver);
		wu.switchtoAlertAndAccept(driver);
		Reporter.log("FaceBook link is working",true);
		
		//Click on Google link
		hp.getGoogleLink().click();
		wu.navigationBack(driver);
		wu.navigationRefresh(driver);
		wu.switchtoAlertAndAccept(driver);
		Reporter.log("Google link working Good",true);
		
//		//Click on pinterest link
//		hp.getPinterestLink().click();
//		wu.navigationBack(driver);
//		wu.navigationRefresh(driver);
//		wu.switchtoAlertAndAccept(driver);
//		System.out.println("Pinterest link is working");
	}
}
