package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPractice {

	
	@Test
	public void sample() {
		
		String a = "Hi";
		String b = "hi";
		
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
//		Assert.assertEquals(2, 2);
//		Assert.assertTrue(a.contains("Hi"));
//		Assert.assertTrue(b.contains("a"));
//		Assert.assertEquals(a,b);
		Assert.assertTrue(true, a);
	
		
		
		System.out.println("Step 4");
		System.out.println("Step 5");
		System.out.println("Step 6");
	}
}
