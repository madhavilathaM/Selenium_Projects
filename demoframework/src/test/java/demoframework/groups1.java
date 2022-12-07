package demoframework;

import org.testng.annotations.Test;

public class groups1 {
	
	@Test(groups= {"include"})
	public void testcase1()
	{
		System.out.println("Hi Madhavi");	
		}

	@Test(groups= {"include"})
	public void testcase2()
	{
		System.out.println("Welcome to Moolya");	
		}
	
	
	
	@Test(groups= {"exclude"})
	public void testcase3()
	{
		System.out.println("Congraulations");	
		}
	
	
	
	
}
