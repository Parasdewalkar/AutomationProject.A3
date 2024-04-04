package objectRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtility;

public class CreatingNewLeadPage extends SeleniumUtility{

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement leadFirstName;
	
	@FindBy(xpath="//select[@name=\'salutationtype\']")
	private WebElement leadFirstnameDropdown;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	
	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}



	public WebElement getLeadFirstName() {
		return leadFirstName;
	}
	
	
	
	public WebElement getLeadFirstnameDropdown() {
		return leadFirstnameDropdown;
	}

	public void enterLeadFirstName() {
		leadFirstName.sendKeys("paras");
	}
	
	
	public void leadSourcedropdownAndFN(String firstName,String leadSourceValue) {
		leadFirstName.sendKeys(firstName);
		handleDropdown(leadSourceDropdown, leadSourceValue);
		
	}
	
	
	
	
}
