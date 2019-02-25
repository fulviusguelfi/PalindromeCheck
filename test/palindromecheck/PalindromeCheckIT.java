/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fulvi
 */
public class PalindromeCheckIT {

    public PalindromeCheckIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PalindromeCheck.
     */
    /**
     * Test of main method, of class PalindromeCheck.
     */
    /**
     * Test of isCaseSensitive method, of class PalindromeCheck.
     */
    @Test
    public void testIsCaseSensitive() {
        System.out.println("isCaseSensitive");
        String parm = "true";
        PalindromeCheck instance = new PalindromeCheck("");
        PalindromeCheck expResult = instance.isCaseSensitive("true");
        PalindromeCheck result = instance.isCaseSensitive(parm);
        assertEquals(expResult, result);
    }

    /**
     * Test of isConsiderWhiteSpaces method, of class PalindromeCheck.
     */
    @Test
    public void testIsConsiderWhiteSpaces() {
        System.out.println("isConsiderWhiteSpaces");
        String parm = "";
        PalindromeCheck instance = new PalindromeCheck("");
        PalindromeCheck expResult = instance.isConsiderWhiteSpaces("true");
        PalindromeCheck result = instance.isConsiderWhiteSpaces(parm);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class PalindromeCheck.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        PalindromeCheck instance = new PalindromeCheck("teset");
        boolean expResult = true;
        boolean result = instance.check();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class PalindromeCheck.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PalindromeCheck.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
