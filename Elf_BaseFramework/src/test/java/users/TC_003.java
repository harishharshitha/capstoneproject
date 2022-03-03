package users;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ReportsPage;

public class TC_003 extends Base_Class{
	
	@Test
	public void reports()  {

		ReportsPage reports=new ReportsPage(driver);
		reports.getReport().click();
		reports. getCreatechartmodule().click();
		reports.getAllshowdropdown().click();
		reports.getSelectedstaff().click();
		reports. getAllshowdropdown().click();
		reports.getSelectedstaff().click();
		reports.getUserswithoutdropdown().click();
	}
}



























