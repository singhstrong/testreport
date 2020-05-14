package first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {
	@BeforeSuite
	public void beforesuite()
	{
	System.out.println("beforesuite");	
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beformethod");	

	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("befortest");	

	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforclass");	
	}
	@Test
	public void test1()
	{
		System.out.println("testcas1");	
	
	}
	@Test
	public void test2()
	{
		System.out.println("testcase2");	
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("afterrtest");	

	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");	
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftrsuite");	
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");	
		
	}
}


