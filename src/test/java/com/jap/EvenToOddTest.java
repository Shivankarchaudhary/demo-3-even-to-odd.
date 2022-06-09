package com.jap;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenToOddTest{

    EvenToOdd evenToOdd;
    @Before
    public void setUp() {
       evenToOdd = new EvenToOdd();
       int array[]= {34,34,56,67,78,77,67};
    }

    @After
    public void tearDown()
    {
        evenToOdd = null;
    }

    @Test
    public void givenIntegerArrayReturnOddArray() {
        int array[]= {34,33,56,67,78,77,67};
        int actualResult[] = evenToOdd.getOddArray(array);
        assertArrayEquals(new int[]{35,33,57,67,79,77,67},actualResult);

    }
    @Test
    public void givenNegativeIntegerArrayReturnOddArray() {
        int array[]= {38,-33,-55,67,79,-77,68};
        int actualResult[] = evenToOdd.getOddArray(array);
        assertArrayEquals(new int[]{39,-33,-55,67,79,-77,69},actualResult);

    }
}