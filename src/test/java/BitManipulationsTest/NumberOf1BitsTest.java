package BitManipulationsTest;

import BitManipulations.NumberOf1Bits;
import org.junit.Assert;
import org.junit.Test;

public class NumberOf1BitsTest {

    @Test
    public void testNumSetBits1() {
        NumberOf1Bits solution = new NumberOf1Bits();
        int input = 10; // Binary representation: 1010
        int expected = 2; // Number of 1 bits: 2
        Assert.assertEquals(expected, solution.numSetBits(input));
    }

    @Test
    public void testNumSetBits2() {
        NumberOf1Bits solution = new NumberOf1Bits();
        int input = 7; // Binary representation: 111
        int expected = 3; // Number of 1 bits: 3
        Assert.assertEquals(expected, solution.numSetBits(input));
    }

    @Test
    public void testNumSetBits3() {
        NumberOf1Bits solution = new NumberOf1Bits();
        int input = 0; // Binary representation: 0
        int expected = 0; // Number of 1 bits: 0
        Assert.assertEquals(expected, solution.numSetBits(input));
    }

    @Test
    public void testNumSetBits4() {
        NumberOf1Bits solution = new NumberOf1Bits();
        int input = 15; // Binary representation: 1111
        int expected = 4; // Number of 1 bits: 4
        Assert.assertEquals(expected, solution.numSetBits(input));
    }

    @Test
    public void testNumSetBits5() {
        NumberOf1Bits solution = new NumberOf1Bits();
        int input = 255; // Binary representation: 11111111
        int expected = 8; // Number of 1 bits: 8
        Assert.assertEquals(expected, solution.numSetBits(input));
    }
}

