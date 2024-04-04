package objectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  ContactsPage {

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateContactBtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateContactBtn() {
		return CreateContactBtn;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}
	
	
	public void clickOnCreateContactLookUpImg() {
		CreateContactBtn.click();
	}
	
	
	
	
}
