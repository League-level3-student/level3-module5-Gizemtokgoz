package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(42, RecursionMath.recursiveMultiplication(6, 7));
        assertEquals(55, RecursionMath.recursiveMultiplication(11, 5));
        // Add more JUnit tests like the one above to test your method
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(5, RecursionMath.recursiveDivision(15, 3));
    	assertEquals(7, RecursionMath.recursiveDivision(49, 7));
    	assertEquals(9, RecursionMath.recursiveDivision(72, 8));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(27, RecursionMath.recursivePower(3, 3));
    	assertEquals(16, RecursionMath.recursivePower(2, 4));
    	assertEquals(49, RecursionMath.recursivePower(7, 2));
    }
}
