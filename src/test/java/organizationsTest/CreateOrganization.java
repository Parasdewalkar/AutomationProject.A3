package organizationsTest;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.CreateNewOrganization;
import objectRepository.Organizationspage;

public class CreateOrganization extends BaseClass{

	@Test
	public void createOrganizationWithMandatoryFields() throws InterruptedException {
		Organizationspage orgPage = new Organizationspage(driver);
		orgPage.clickOnOrganizationTab();
		
		CreateNewOrganization cnOrg =new CreateNewOrganization(driver);
		cnOrg.enterOrganizationFields("Vitsarahhg", "www.vitsara.in", "898546", "Apparel", "Market Failed");
		
		
		
		
		
		
		
	}

	
}
