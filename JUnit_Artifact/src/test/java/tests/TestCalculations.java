//Jacob Johnson
//jejohnson8@dmacc.edu
//test class for unit testing
package tests;

import org.junit.Before;
import org.junit.Test;

import model.calculations;
import model.moneyMarket;

public class TestCalculations {
	
	calculations calc = new calculations();
	moneyMarket account = new moneyMarket(50000.00, 1.3, 10);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		account.setDeposit(50000.00);
		account.setRate(1.3);
		account.setYears(10);
		@SuppressWarnings("unused")
		double tb = calc.calculateTotalBalance(account);
		
	}

}
