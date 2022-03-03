package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage   {
	public ReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class ='content reports']") 
	private WebElement report;
	
	public WebElement getReport() {
		return report;
	}
	
	@FindBy(xpath="//div[@class='graphicButton dropdownButton createReportDropdownButton']")
	private WebElement newreport;
	
	public WebElement getNewreport() {
		return newreport;
	}
	
	@FindBy(xpath="//a[@href='/reports/leaves.do']")
	private WebElement LeaveTimeBalances;
	
	public WebElement getLeaveTimeBalances() {
		return LeaveTimeBalances;
	}

	@FindBy(xpath="//button[text()='Do not use 2nd grouping level']")
	private WebElement DataGrouping;

	public WebElement getDataGrouping() {
	return DataGrouping;
}
	@FindBy(xpath="//span[@id='applyReportConfiguration']")
	private WebElement generatepdf;

	public WebElement getGeneratepdf() {
		return generatepdf;
	}

  @FindBy(xpath="//span[text()='Create Chart']")
  private WebElement createchartmodule;

public WebElement getCreatechartmodule() {
	return createchartmodule;
}
  
  @FindBy(xpath="//div[@class='addToDashboard']")
  private WebElement AddtoDashboard;

public WebElement getAddtoDashboard() {
	return AddtoDashboard;
}
  
  @FindBy(xpath="//input[@class='reportNameEdit inputFieldWithPlaceholder']")
  private WebElement chartname;

  public WebElement getChartname() {
		return chartname;
	}
  
@FindBy(xpath="//td[@class='saveNewConfigButton greyButton']")
private WebElement savemodule;

public WebElement getSavemodule() {
	return savemodule;
}

@FindBy(xpath="//div[@id='createChartLightbox_commitBtn']")
private WebElement exportpdf;

public WebElement getExportpdf() {
	return exportpdf;
}

@FindBy(xpath="//span[text()='Download PDF']")
private WebElement downloadpdf;


public WebElement getDownloadpdf() {
	return downloadpdf;
}

@FindBy(xpath="(//div[@class='arrow'])[12]")
private WebElement allshowdropdown;

public WebElement getAllshowdropdown() {
	return allshowdropdown;
}
@FindBy(xpath="(//img[@class='x-form-radio'])[1]")
private WebElement selectedstaff;

public WebElement getSelectedstaff() {
	return selectedstaff;
}

@FindBy(xpath="//span[text()='Users Without Department']")
private WebElement userswithoutdropdown;

public WebElement getUserswithoutdropdown() {
	return userswithoutdropdown;
}







  

	

	
	

	

		}