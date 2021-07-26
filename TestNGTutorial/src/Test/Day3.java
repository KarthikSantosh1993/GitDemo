package Test;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups ="Smoke")
	public void repeat3() {
		System.out.println ("will repeat every day as groups in Day3 class");
	}
	@Test
	public void webLoginCarLoan() {
		System.out.println ("web Login CarLoan of day3 ");
	}

	@Test
	public void mobileLoginCarLoan() {
		System.out.println ("mobile Login CarLoanof day3 ");
	}
	@Test(dependsOnMethods ={"webLoginCarLoan", "mobileLoginCarLoan"}) //web login will execute before mobile login
	public void apiLoginCarLoan() {
		System.out.println ("API Login CarLoan of day3 ");
	}
	
	@Test (enabled=false)  //this test case will not execute -- may be this contains bugs and need to be skipped 
	public void iPadLoginCarLoan() {
		System.out.println ("iPad Login CarLoanof day3 ");
	}
}
