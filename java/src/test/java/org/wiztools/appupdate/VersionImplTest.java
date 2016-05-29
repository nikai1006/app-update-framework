package org.wiztools.appupdate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subhash
 */
public class VersionImplTest {
    
    public VersionImplTest() {
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
     * Test of getMajor method, of class VersionImpl.
     */
    @Test
    public void testGetMajor() {
        System.out.println("getMajor");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 3;
        int result = instance.getMajor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinor method, of class VersionImpl.
     */
    @Test
    public void testGetMinor() {
        System.out.println("getMinor");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 4;
        int result = instance.getMinor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatch method, of class VersionImpl.
     */
    @Test
    public void testGetPatch() {
        System.out.println("getPatch");
        VersionImpl instance = new VersionImpl("3.4.5");
        int expResult = 5;
        int result = instance.getPatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLessThan method, of class VersionImpl.
     */
    @Test
    public void testIsLessThan() {
        System.out.println("isLessThan");
        Version v = new VersionImpl("3.4.2");
        VersionImpl instance = new VersionImpl("3.4.1");
        boolean expResult = true;
        boolean result = instance.isLessThan(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isGreaterThan method, of class VersionImpl.
     */
    @Test
    public void testIsGreaterThan() {
        System.out.println("isGreaterThan");
        Version v = new VersionImpl("3.4.1");
        VersionImpl instance = new VersionImpl("3.4.1");
        boolean expResult = false;
        boolean result = instance.isGreaterThan(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isLessThanOrEqual method, of class VersionImpl.
     */
    @Test
    public void testIsLessThanOrEqual() {
        System.out.println("isLessThanOrEqual");
        Version v = new VersionImpl("2.3");
        VersionImpl instance = new VersionImpl("2.3");
        boolean expResult = true;
        boolean result = instance.isLessThanOrEqual(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isGreaterThanOrEqual method, of class VersionImpl.
     */
    @Test
    public void testIsGreaterThanOrEqual() {
        System.out.println("isGreaterThanOrEqual");
        Version v = new VersionImpl("2.3");
        VersionImpl instance = new VersionImpl("2.3");
        boolean expResult = true;
        boolean result = instance.isGreaterThanOrEqual(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isWithin method, of class VersionImpl.
     */
    @Test
    public void testIsWithin() {
        System.out.println("isWithin");
        Version min = new VersionImpl("1.0");
        Version max = new VersionImpl("2.0");
        VersionImpl instance = new VersionImpl("1.0");
        boolean expResult = true;
        boolean result = instance.isWithin(min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of isBetween method, of class VersionImpl.
     */
    @Test
    public void testIsBetween() {
        System.out.println("isBetween");
        Version min = new VersionImpl("1.0");
        Version max = new VersionImpl("2.0");
        VersionImpl instance = new VersionImpl("1.0");
        boolean expResult = false;
        boolean result = instance.isBetween(min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class VersionImpl.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new VersionImpl("1.0");
        VersionImpl instance = new VersionImpl("1.0");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
