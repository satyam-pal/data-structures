package ArrayTest;

import Array.FirstMissingInteger;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FirstMissingIntegerTest {
    FirstMissingInteger solution = new FirstMissingInteger();

    @Test
    public void test1() {


        // Test case 1: Missing positive number is 3
        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(0);
        input1.add(4);
        Assert.assertEquals(3, solution.firstMissingPositive(input1));
    }
        // Test case 2: Missing positive number is 2
    @Test
    public void test2() {
        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(1);
        input2.add(3);
        input2.add(0);
        input2.add(4);
        Assert.assertEquals(2, solution.firstMissingPositive(input2));
    }
        // Test case 3: Missing positive number is 1
    @Test
    public void test3() {
        ArrayList<Integer> input3 = new ArrayList<>();
        input3.add(0);
        input3.add(2);
        input3.add(3);
        input3.add(4);
        Assert.assertEquals(1, solution.firstMissingPositive(input3));
    }

        // Test case 4: All positive numbers present
    @Test
    public void test4() {
        ArrayList<Integer> input4 = new ArrayList<>();
        input4.add(1);
        input4.add(2);
        input4.add(3);
        input4.add(4);
        Assert.assertEquals(5, solution.firstMissingPositive(input4));

        // Test case 5: Empty array
        ArrayList<Integer> input5 = new ArrayList<>();
        Assert.assertEquals(1, solution.firstMissingPositive(input5));
    }
}
