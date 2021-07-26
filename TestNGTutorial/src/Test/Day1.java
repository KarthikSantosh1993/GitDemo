package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println ("the first statement to be executed before starting all modules");
	}
	
	@BeforeClass 
	public void bfClass() {
		System.out.println ("the first statement to be executed before starting class");
	}
	
	@BeforeTest
	public void prerequisites()
	{
		System.out.println("I will execute first inside the module ");
	}
	
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("will execute before every method inside the module ");
	}
	
	@Test(groups ="Smoke")
	public void repeat() {
		System.out.println ("will repeat every day as groups in Day1 class");
	}
	@Test
	public void demo() {
		System.out.println ("in demo 1 Testcase");
	}
	@Test
	public void testDemo() {
		System.out.println ("in demo2 testcase");
	}
	
	
	@AfterTest
	public void last()
	{
		System.out.println("I will execute last inside the module");
	}
	
	
	@AfterSuite
	public void afSuite() {
		System.out.println ("the last statement to be executed after finishing all testcases");
	}
}
