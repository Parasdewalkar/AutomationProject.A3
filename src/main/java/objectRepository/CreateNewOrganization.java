package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtility;

public class CreateNewOrganization extends SeleniumUtility {

	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organizationNameTextFiled;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteTextField;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneTextFiled;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDropdown;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingDropdown;

	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement orgSaveBtn;
	
	public CreateNewOrganization (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrganizationNameTextFiled() {
		return organizationNameTextFiled;
	}

	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	public WebElement getPhoneTextFiled() {
		return phoneTextFiled;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getRatingDropdown() {
		return ratingDropdown;
	}
	
	
	
	
	
	public WebElement getOrgSaveBtn() {
		return orgSaveBtn;
	}
	public void enterOrganizationFields(String orgTextField, String websiteTextfield, String phoneTextfiled, String industryValue, String ratingValue ) {
		organizationNameTextFiled.sendKeys(orgTextField);
		websiteTextField.sendKeys(websiteTextfield);
		phoneTextFiled.sendKeys(phoneTextfiled);
		
		handleDropdown(industryDropdown, industryValue);
		handleDropdown(ratingDropdown, ratingValue);
		
		orgSaveBtn.click();
	}
	
}