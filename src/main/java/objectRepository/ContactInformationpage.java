package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationpage {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactHeader;
	
	public ContactInformationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactHeader() {
		return contactHeader;
	}
	
	public String captureHeaderText() {
		 return contactHeader.getText();
	}
}
