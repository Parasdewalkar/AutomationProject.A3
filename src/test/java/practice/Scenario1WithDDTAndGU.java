package practice;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

import genericUtilities.ExcelFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.SeleniumUtility;
import objectRepository.ContactInformationpage;
import objectRepository.ContactsPage;
import objectRepository.CreateNewContact;
import objectRepository.homePage;
import objectRepository.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario1WithDDTAndGU {

	public static void main(String[] args) throws IOException, Exception {

//		Create Object of all Utility Classes
		
		PropertyFileUtility pUTIL = new PropertyFileUtility();
		ExcelFileUtility eUTIL = new  ExcelFileUtility();
		SeleniumUtility sUTIL = new SeleniumUtility();
		
//		Read all the Data
		
		/*Read data from property file */
		
		String URL = pUTIL.readDataFromPropertyFile("url");
		String USERNAME = pUTIL.readDataFromPropertyFile("username");
		String PASSWORD = pUTIL.readDataFromPropertyFile("password");
		
		/*Read data from Excel Sheet */
		String LASTNAME = eUTIL.readDataFromExcelFile("Contacts", 1, 2);
		
		
//		Step 1:Launch The Browser
		
		WebDriver driver = new FirefoxDriver();
		sUTIL.maximizeWindow(driver);
		sUTIL.addImplicitlyWait(driver);
		driver.get(URL);
		
		
//		Step 2: Login To Application
		
		loginPage lPage = new loginPage(driver);
		lPage.loginApp(USERNAME, PASSWORD);

		
//		step 3: NAvigate To Contacts Link
		
		homePage hPage = new homePage(driver);
		hPage.clickOnContact();
		hPage.getContactLink();
		
		
//		Step 4: Click on Create Contact lookup Image
		
		ContactsPage contactPage = new ContactsPage(driver);
		contactPage.clickOnCreateContactLookUpImg();
		
		
//		Step 5: Create Contact With Mandatory Fields And save
		Thread.sleep(2000);
		
		CreateNewContact createContact = new CreateNewContact(driver);
//		createContact.createNewContact(LASTNAME);
		
		createContact.createNewContact(LASTNAME, "Existing Customer");
		
//		Step 6: Validate For Contact
		
		Thread.sleep(2000);
		ContactInformationpage contactInfo = new ContactInformationpage(driver);
		
		String contactHeader = contactInfo.captureHeaderText();
//		
		System.out.println(contactHeader);
		
		if(contactHeader.contains(LASTNAME)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
//		Step 7: Logout Of The Application
		hPage.logoutApp(driver);
		
		driver.quit();
	}

}
