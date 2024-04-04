package contactsTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.SeleniumUtility;
import objectRepository.ContactInformationpage;
import objectRepository.ContactsPage;
import objectRepository.CreateNewContact;
import objectRepository.homePage;
import objectRepository.loginPage;


  @Listeners(genericUtilities.ListenerImplementation.class)
public class CreateNewContactTest extends BaseClass{

	@Test
	public void CreateNewContactWithMandatoryFields() throws IOException, InterruptedException
	{
		
//		Create Object of all Utility Classes
		
		
		
//		Read all the Data
		
		/*Read data from property file */
		
		/*Read data from Excel Sheet */
		String LASTNAME = eUTIL.readDataFromExcelFile("Contacts", 1, 2);
		
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
		
		Assert.assertTrue(contactHeader.contains(LASTNAME));
		
		System.out.println(contactHeader);
		
//		Instead Of If Else Condition Use Hard Assert.
		
//		if(contactHeader.contains(LASTNAME)) {
//			System.out.println("pass");
//		} 
//		else {
//			System.out.println("fail");
//		}
		
	}
	
	public void demo() {
		System.out.println("Demo");
	}
}
