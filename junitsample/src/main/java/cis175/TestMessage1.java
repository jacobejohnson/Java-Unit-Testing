//Jacob Johnson
//jejohnson8@dmacc.edu
//2/6/18
package cis175;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.MessageUtil;
import model.MessageUtil;
import model.MessageUtil;
public class TestMessage1 {
	
	String message = "Robert";   
	MessageUtil messageUtil = new MessageUtil(message); 

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testMessageLength() {
		System.out.println("Inside testOfMessageLength()");
		int messageLength = message.length();
		assertTrue(messageLength == messageUtil.returnMessageLength()); 
	}
	
	public int returnMessageLength() {
		return message.length();
	}
	
	@Test
	public void testMessageNotNull() {
		System.out.println("Inside testOfMessageNotNull()");
		assertNotNull(messageUtil.printMessage( ));
	}
	

}
