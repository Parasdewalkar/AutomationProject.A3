package practice;

import org.testng.annotations.Test;

public class PracticeTestNgInvocationCount {

	@Test(invocationCount = 2)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(invocationCount = 3)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test
	public void deleteLead() 
	{
		System.out.println("Delete Lead");
	}
}
