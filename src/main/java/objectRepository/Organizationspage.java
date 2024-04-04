package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtility;

public class Organizationspage extends SeleniumUtility{

	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organizationsTab;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationLookupicon;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutBtn;
	
	
	public Organizationspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrganizationsTab() {
		return organizationsTab;
	}


	public WebElement getCreateOrganizationLookupicon() {
		return createOrganizationLookupicon;
	}


	public WebElement getAdminIcon() {
		return adminIcon;
	}


	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
	
	public void clickOnOrganizationTab() {
		organizationsTab.click();
		createOrganizationLookupicon.click();
	}
	
	public void logoutOfApp(WebDriver driver) throws InterruptedException {
		mouseHoverAction(driver, adminIcon);
		Thread.sleep(2000);
		signOutBtn.click();
	}
	
	
	
	
}
