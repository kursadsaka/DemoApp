package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest (String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testFoundTheCubeAndSum() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(11, 112, 36, 4, 64));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 4, 5));
		assertTrue(new App().searchAndSum(array, 4, array2, 48));
	}
    
    public void testNotFoundTheCube() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(11, 112, 36, 4));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 4, 5));
		assertFalse(new App().searchAndSum(array, 4, array2, 48));
	}
    
    public void testCouldNotGetTheSum() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(11, 112, 36, 4, 64));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 4, 5));
		assertFalse(new App().searchAndSum(array, 4, array2, 49));
	}

    public void testEmptyArray1() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        assertFalse(new App().searchAndSum(array, 5, array2, 60));
    }

    public void testEmptyArray2() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 25));
        ArrayList<Integer> array2 = new ArrayList<>();
        assertFalse(new App().searchAndSum(array, 5, array2, 60));
    }

    public void testNullArray1() {
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        assertFalse(new App().searchAndSum(null, 5, array2, 60));
    }

    public void testNullArray2() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 25));
        assertFalse(new App().searchAndSum(array, 5, null, 60));
    }
    
}
