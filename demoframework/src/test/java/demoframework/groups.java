package demoframework;

import org.testng.annotations.Test;

public class groups {
	
	
	@Test(priority=1,groups= {"Names"})
	public void tc1()
	{
		System.out.println("madhavi");
	}

	@Test(priority=1,groups= {"Maths"})
	public void tc2()
	{
		int sum;int a;int b;
		a=10;b=20;
		sum=a+b;
		System.out.println(sum);
	}
	@Test(priority=2,groups= {"Names"})
	public void tc3()
	{
		System.out.println("Lekha");
	}
	@Test(priority=2,groups= {"Maths"})
	public void tc4()
	{
		
		int mul;int a;int b;
		a=10;b=20;
		mul=a*b;
		System.out.println(mul);
	}



}
