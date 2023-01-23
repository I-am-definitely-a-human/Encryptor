package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import model.ED;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
public class DecryptionTest {
	
	private ED decryptor;
	private String message;
	
	private ED decryptor2;
	private String message2;
	
	@Before
	public void setUp() throws Exception {
		decryptor = new ED("Banana");
		message = "JAZJYFaQW mB";
		
		decryptor2 = new ED("Something");
		message2 = "dPhJg";
	}

	@Test
	public void testDecrypt() {
		assertEquals("I like pizza", decryptor.decrypt(message));
	}
	
	@Test
	public void testDecrypt2() {
		assertFalse(!decryptor2.decrypt(message2).equals("Maven"));
	}
	
	@Test
	public void testDecrypt3() {
		assertNotNull(decryptor.decrypt(message));
	}

}
