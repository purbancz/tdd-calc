package pl.edu.agh.mwo.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private Calculator calc;


    @Before
    public void createCalcuatorForTheTest() {
        calc = new Calculator();
    }


    @Test
    public void testAddition(){
        assertEquals(4, calc.add(2,2));
        assertEquals(3, calc.add(1,2));
        assertEquals(0, calc.add(-2,2));
    }


    @Test
    public void testSubstraction(){
        assertEquals(0, calc.substract(2,2));
        assertEquals(-1, calc.substract(1,2));
        assertEquals(-4, calc.substract(-2,2));
    }

    @Test
    public void testMultiplication(){
        assertEquals(4, calc.multiply(2,2));
        assertEquals(2, calc.multiply(1,2));
        assertEquals(-4, calc.multiply(-2,2));
    }

    @Test
    public void testDivision(){
        assertEquals(1, calc.divide(2,2));
        assertEquals(2, calc.divide(4,2));
        assertEquals(-1, calc.divide(-2,2));
    }

//    @Test(expected = ArithmeticException.class)

//    @Test
//    public void testAverage(){
//        assertEquals(2, calc.average(2,2));
//        assertEquals(1.5, calc.average(1,2));
//        assertEquals(0, calc.average(-2,2));
//    }



}
