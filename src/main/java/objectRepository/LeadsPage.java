package objectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	 @FindBy(xpath="//img[@alt='Create Lead...']")
	 private WebElement CreateLeadIcon;
	 
	 
	 public LeadsPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }


	public WebElement getCreateLeadIcon() {
		return CreateLeadIcon;
	}
	 
	 public void clickOnCreateLeadLookUpIcon() {
		 CreateLeadIcon.click();
	 }
}
