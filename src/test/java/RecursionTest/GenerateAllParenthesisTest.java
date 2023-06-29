package RecursionTest;
import Recursion.GenerateAllParenthesis;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenerateAllParenthesisTest {

    @Test
    public void testGenerateParenthesis1() {
        GenerateAllParenthesis generator = new GenerateAllParenthesis();
        int input = 1;
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("()"));
        Assert.assertTrue(expected.containsAll(generator.generateParenthesis(input)));
    }

    @Test
    public void testGenerateParenthesis2() {
        GenerateAllParenthesis generator = new GenerateAllParenthesis();
        int input = 2;
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("()()", "(())"));
        Assert.assertTrue(expected.containsAll(generator.generateParenthesis(input)));
    }

    @Test
    public void testGenerateParenthesis3() {
        GenerateAllParenthesis generator = new GenerateAllParenthesis();
        int input = 3;
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("()()()", "()(())", "(())()", "(()())", "((()))"));
        Assert.assertTrue(expected.containsAll(generator.generateParenthesis(input)));
    }

    @Test
    public void testGenerateParenthesis4() {
        GenerateAllParenthesis generator = new GenerateAllParenthesis();
        int input = 4;
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
                "()()()()", "()()(())", "()(())()", "()(()())", "()((()))",
                "(())()()", "(())(())", "(()())()", "(()()())", "(()(()))",
                "((()))()", "((())())", "((()()))", "(((())))"));
        Assert.assertTrue(expected.containsAll(generator.generateParenthesis(input)));
    }

    @Test
    public void testGenerateParenthesis5() {
        GenerateAllParenthesis generator = new GenerateAllParenthesis();
        int input = 0;
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertTrue(expected.containsAll(generator.generateParenthesis(input)));
    }
}

