package annotations;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(annotations.LogItestListner.class)

public class TestClasswithListnerImplemented {

	
	
	@Test (priority = -7)
	public void testMethod1() {
		System.out.println("testMethod1 Method is ecxuted ");
	}

	@Test (priority = -5, enabled = true ) // or false
	public void testMethod2() {
		System.out.println("testMethod2 Method is ecxuted ");
		Assert.fail();
	}

	@Test (priority = 1, invocationCount = 3)
	public void testMethod3() {
		System.out.println("testMethod3 Method is ecxuted ");
	}

	@Test (priority = 3, dependsOnMethods= {"testMethod2"})
	public void testMethod4() {
		System.out.println("testMethod4 Method is ecxuted ");
	}

	@Test
	public void testMethod5() {
		System.out.println("testMethod5 Method is ecxuted ");
	}
}
