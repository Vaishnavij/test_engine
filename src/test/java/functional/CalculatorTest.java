package functional;

import engine.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class CalculatorTest {

    Calculator test= new Calculator();

    @Test
    public void addTest(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    public void subTest(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(1, divide);
    }

    public void addTest1(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    public void subTest1(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest1(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest1(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(1, divide);
    }

    @Test
    public void addTest2(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(2, addValue);
    }

    @Test
    public void subTest2(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-23, subValue);
    }

    @Test
    public void multiplyTest2(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest2(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(10, divide);
    }

    @Test
    public void addTest4(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    public void subTest4(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest4(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(10, multiply);
    }

    @Test
    public void divisionTest4(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(10, divide);
    }

}
