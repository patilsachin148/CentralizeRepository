package annotations;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNgAnnotation {

	@Test 
	public void abc() {
		System.out.println("ABC Method is ecxuted- 1");
	}

	@Test(priority = -5, enabled = true ) // or false
	public void def() {
		System.out.println("DEF Method is ecxuted- 2");
		Assert.fail();
	}

	@Test(priority = 1, invocationCount = 3)
	public void ghi() {
		System.out.println("GHI Method is ecxuted- 3");
	}

	@Test(priority = 3, dependsOnMethods= {"def"} )
	public void jkl() {
		System.out.println("JKL Method is ecxuted- 4 ");
	}

	@Test
	public void klm() {
		System.out.println("klm Method is ecxuted -5");
	}

}
