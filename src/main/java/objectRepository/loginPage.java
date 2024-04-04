package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	@FindBy(name = "user_name")
	private WebElement usernameEdt;
	
	@FindBy(name = "user_password")
	private WebElement passwordEdt;
	
	@FindBy(id =  "submitButton")
	private WebElement submitBtn;
	
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getUsernameEdt() {
		return usernameEdt;
	}


	public WebElement getPasswordEdt() {
		return passwordEdt;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void loginApp(String username, String password) {
		
		getUsernameEdt().sendKeys(username);
		getPasswordEdt().sendKeys(password);
		getSubmitBtn().click();
	}
	
	
}
