package users;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ReportsPage;

public class TC_002 extends Base_Class{
	
	@Test
	public void reports()  {

	ReportsPage reports=new ReportsPage(driver);
	reports.getReport().click();
	reports. getCreatechartmodule().click();
	reports.getAddtoDashboard().click();
	reports. getChartname().sendKeys("Products");
	reports.getSavemodule().click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	reports.getExportpdf().click();
	reports. getDownloadpdf().click();
	}
	

}
























