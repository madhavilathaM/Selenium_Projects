package demoframework;

import org.testng.annotations.Test;

public class test2 {
@Test(priority=1,groups= {"Smoke"})

	public void tc1()
	{
	System.out.println("Smoke");
	}
	@Test(priority=1,groups= {"Regression"})
	public void tc2()
	{
		System.out.println("Regression");
	}
	@Test(priority=2,groups= {"Smoke"})
	public void tc3()
	{
		System.out.println("Smoke2");
	}
	@Test(priority=2,groups= {"Regression"})
	public void tc4()
	{
		System.out.println("Regression2");
	}
}
