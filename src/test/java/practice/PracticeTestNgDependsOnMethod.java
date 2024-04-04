package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTestNgDependsOnMethod {

	@Test
	public void createContact() {
		Assert.fail();
		System.out.println("Contact Created");
	}
	
	
	@Test(dependsOnMethods = "createContact")
	public void editContact() {
		System.out.println("Contact Edited");
	}
	
	
	@Test
	public void deleteContact() {
		System.out.println("Contact deleted");
	}
}
