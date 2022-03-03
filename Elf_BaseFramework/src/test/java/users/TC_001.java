package users;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import genericLibrary.Base_Class;
import pomRepository.ReportsPage;


	public class TC_001 extends Base_Class{
		
		@Test
		public void reports() throws InterruptedException  {
			ReportsPage reports1=new ReportsPage(driver);
			Thread.sleep(30000);
			reports1.getReport().click();
			reports1.getNewreport().click();
			reports1.getLeaveTimeBalances().click();
			reports1.getDataGrouping().click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			reports1.getGeneratepdf().click();
		}
		

	}