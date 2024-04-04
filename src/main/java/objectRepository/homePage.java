package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtility;

public class homePage extends SeleniumUtility{

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutLink;
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leadsTab;
	
	


	public homePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeadsTab() {
		return leadsTab;
	}


	public WebElement getAdminImg() {
		return adminImg;
	}



	public WebElement getSignoutLink() {
		return signoutLink;
	}



	public WebElement getContactLink() {
		return contactLink;
	}
	
	
	public void clickOnContact() {
		getContactLink().click();
	}
	
	public void logoutApp(WebDriver driver) throws InterruptedException {
		mouseHoverAction(driver, adminImg);
		Thread.sleep(1000);
		signoutLink.click();
	}
	
	
	public void clickOnLeadsTab() {
		leadsTab.click();
	}

	
}
