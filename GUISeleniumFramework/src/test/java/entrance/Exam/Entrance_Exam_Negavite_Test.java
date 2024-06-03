package entrance.Exam;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Entrance_Exam_Store;
import com.comcast.crm.objectrepositoryutility.Home;

public class Entrance_Exam_Negavite_Test extends BaseClass{
	@Test
	public void entrance_exam_Negative_Test() {
		WebDriverUtility wdu= new WebDriverUtility();
		wdu.waitForPageToLoad(driver);
		Home home= new Home(driver);
		home.getSearchTextFiled().sendKeys("1234",Keys.ENTER);
		Entrance_Exam_Store ees= new Entrance_Exam_Store(driver);
		String msg=ees.getNoFounds().getText();
		Assert.assertEquals(msg, "FOUND 0 RECORDS", "No valid search");
		
		
		
	}
	

}
