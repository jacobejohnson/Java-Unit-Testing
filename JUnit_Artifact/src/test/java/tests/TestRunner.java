//Jacob Johnson
//jejohnson8@dmacc.edu
//test runner
//Prints out true if working and false if not work, as shown in lab (source)
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure; 

public class TestRunner {
	
	public static void main(String[] args) {
		
		
		Result result = JUnitCore.runClasses(TestCalculations.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString()); 
		}
		
		System.out.println(result.wasSuccessful()); 
		
	}

}
