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
public class EncryptionTest {
	
	private ED encryptor;
	private String message;
	
	private ED encryptor2;
	private String message2;
	
	@Before
	public void setUp() throws Exception {
		encryptor = new ED("Banana");
		message = "Hello world";
		
		encryptor2 = new ED("Something");
		message2 = "JUnit";
	}

	@Test
	public void testEncrypt() {
		assertEquals("IFZMbAxPeMR", encryptor.encrypt(message));
	}
	
	@Test
	public void testEncrypt2() {
		assertTrue(encryptor2.encrypt(message2).equals("aI Nm"));
	}
	
	@Test
	public void testEncrypt3() {
		assertNotNull(encryptor.encrypt(message));
	}

}
