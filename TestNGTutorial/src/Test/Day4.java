package Test;

import org.testng.annotations.Test;

public class Day4 {

	
	public class Day3 {
		
		@Test(groups ="Smoke")
		public void repeat4() {
			System.out.println ("will repeat every day as groups in Day4 class");
		}
		@Test
		public void webLoginHomeLoan() {
			System.out.println ("web Login Home Loan of day4 ");
		}

		@Test
		public void mobileLoginHomeLoan() {
			System.out.println ("mobile Login Home Loan of day4 ");
		}
		@Test
		public void apiLoginHomeLoan() {
			System.out.println ("API Login Home Loan of day4 ");
		}
	}

}
