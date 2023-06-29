package ArrayTest;

import Array.AddOneToNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumberTest {

    @Test
    public void testAddOne_ExampleCase() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4));
        AddOneToNumber addOne = new AddOneToNumber();

        ArrayList<Integer> result = addOne.addOne(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddOne_WithCarry() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0));
        AddOneToNumber addOne = new AddOneToNumber();

        ArrayList<Integer> result = addOne.addOne(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddOne_SingleDigit() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8));
        AddOneToNumber addOne = new AddOneToNumber();

        ArrayList<Integer> result = addOne.addOne(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddOne_Zero() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        AddOneToNumber addOne = new AddOneToNumber();

        ArrayList<Integer> result = addOne.addOne(input);

        Assert.assertEquals(expected, result);
    }
}
