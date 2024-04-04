package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.PropertyFileUtility;
import genericUtilities.SeleniumUtility;

public class CreateNewContact extends SeleniumUtility {

	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@class='crmButton small save']")
	private WebElement saveBTN;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement FirstNameDropdown;
	
	
	
	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}

	public WebElement getFirstNameDropdown() {
		return FirstNameDropdown;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}
	
	
//	Generic Library
	public void createNewContact(String lastname) {
		lastNameTextField.sendKeys(lastname);
		saveBTN.click();
	}
	
	public void createNewContact(String lastname,String leadSourceValue) {
		lastNameTextField.sendKeys(lastname);
		handleDropdown(leadSourceDropdown,leadSourceValue);
		saveBTN.click();
	}
	
}
