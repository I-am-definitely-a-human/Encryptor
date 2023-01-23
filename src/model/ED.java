package model;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */

public class ED {
	
	private String key;
	private final String REFERENCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getREFERENCE() {
		return REFERENCE;
	}
	
	/**
	 * Encrypts a message with a key assigned to the object.
	 * Only letters in the Latin alphabet and spaces.
	 * @param message - the message to encrypt.
	 * @return - the encrypted message
	 */
	public String encrypt(String message) {
		String result = "";
		
		for (int i = 0; i < message.length(); i++) {
			int messageCharNum = REFERENCE.indexOf(message.charAt(i));
			int keyCharNum = REFERENCE.indexOf(this.key.charAt(i % this.key.length()));
			
			int resultCharNum = (messageCharNum + keyCharNum) % REFERENCE.length();
			
			result += REFERENCE.charAt(resultCharNum);
		}
		
		return result;
	}
	
	/**
	 * Decrypts a message with the key assigned to the object.
	 * Only letters in the Latin alphabet and spaces.
	 * @param message - the message to decrypt
	 * @return - the decrypted message
	 */
	public String decrypt(String message) {
		String result = "";
		
		for (int i = 0; i < message.length(); i++) {
			int messageCharNum = REFERENCE.indexOf(message.charAt(i));
			int keyCharNum = REFERENCE.indexOf(this.key.charAt(i % this.key.length()));
			
			int resultCharNum = messageCharNum - keyCharNum;
			if (resultCharNum < 0) {
				resultCharNum += REFERENCE.length();
			}
			
			result += REFERENCE.charAt(resultCharNum);
		}
		
		return result;
	}
	
	/**
	 * Default constructor
	 */
	public ED() {}
	
	/**
	 * Non-default constructor
	 * @param key - the key to assign to this object that will be used for all of its encrypting and decrypting
	 */
	public ED(String key) {
		this.key = key;
	}
	
}
