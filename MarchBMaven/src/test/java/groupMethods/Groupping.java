package groupMethods;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Groupping {

	
	
	@Test (groups = {"Group-A"})
	public void abc() {
		System.out.println("This is ABC is excuted");
		
	}
	@Test(groups = {"Group-A", "Group-B"})
	public void def() {
		System.out.println("This is DEF is excuted");
		
		
	}
	@Test(groups = {"Group-C"},dependsOnMethods = {"abc"}) // Group a also excute if only group c excut because of depend on method.
	public void ghi() {
		System.out.println("This is GHI is excuted");
		
	}@Test(groups = {"Group-D"})
	public void mno() {
		System.out.println("This is MNO is excuted");
		
	}
}
