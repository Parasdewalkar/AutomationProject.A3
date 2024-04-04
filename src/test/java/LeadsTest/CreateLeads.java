package LeadsTest;

import objectRepository.CreatingNewLeadPage;
import objectRepository.LeadsPage;
import objectRepository.homePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
public class CreateLeads extends BaseClass{

	
	@Test
	public void createLeadsWithMandatoryFields () {
		homePage hPage = new homePage(driver);
		hPage.clickOnLeadsTab();
		
		LeadsPage lPage = new LeadsPage(driver);
		lPage.clickOnCreateLeadLookUpIcon();
		
		CreatingNewLeadPage cnlPage = new CreatingNewLeadPage(driver);
		cnlPage.enterLeadFirstName();
		
		cnlPage.leadSourcedropdownAndFN("paras","Cold Call" );
	}

	
}
