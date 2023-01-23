package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */

@RunWith(Suite.class)
@SuiteClasses({ DecryptionTest.class, EncryptionTest.class })
public class AllTests {

}
