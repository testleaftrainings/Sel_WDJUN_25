package week4.day4;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(priority = 1,invocationCount = 5,threadPoolSize = 2,timeOut = 5000)
	public void runcreateLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Unique Lead Id is Create successfully");
	}

	@Test(priority = 2)
	public void runEditLead() {
		System.out.println("Edit Lead");
	}

	@Test(priority = 3,enabled = false)
	public void runDeleteLead() {
		System.out.println("Delete Lead");
	}
	@Test(priority = 3,dependsOnMethods = {"runcreateLead"},alwaysRun = true )
	public void runDuplicateLead() {
		System.out.println("Duplicate Lead");

	}

}
