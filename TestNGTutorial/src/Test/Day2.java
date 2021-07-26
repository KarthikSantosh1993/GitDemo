package Test;

import org.testng.annotations.Test;

public class Day2 {
	
	
	
	@Test
	public void pLoan() {
		System.out.println ("In pLoan of Day 2 class");
	}
	
	@Test(groups ="Smoke")
	public void repeat2() {
		System.out.println ("will repeat every day as groups in Day2 class");
	}
	
}
