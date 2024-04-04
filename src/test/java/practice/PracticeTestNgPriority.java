package practice;

import org.testng.annotations.Test;

public class PracticeTestNgPriority {

	@Test(priority=2)
	public void createContact() {
		System.out.println("createContact");
	}
	
	@Test(priority=1)
	public void modifyContact() {
		System.out.println("modifyContact");
	}
	
	@Test(priority=5)
	public void deleteContact() {
		System.out.println("deleteContact");
	}
}
