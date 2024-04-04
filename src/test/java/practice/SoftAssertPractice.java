package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {

	@Test
	public void softAssertPractice() {
		SoftAssert sa = new SoftAssert();
		String a = "Hi";
		
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
		sa.assertEquals(2, 1);
		sa.assertTrue(a.contains("a"));
		
		System.out.println("Step 4");
		System.out.println("Step 5");
		System.out.println("Step 6");
		
		sa.assertAll();
		
	}
	
}
