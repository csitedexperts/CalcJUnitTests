/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    
    /*public CalculatorTest() {
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
*/
    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testAdd() {
        Calculator calculator=new Calculator();
        double a=5.0;
        double b=5.0;
        double result= calculator.add(a, b);
        System.out.println("result = " + result);
        Assert.assertEquals(null, 10.0, result);
//        Assert.assertEquals(10.0, result);
    }
  @Test
  public void testSub() {
        Calculator calculator=new Calculator();
        double a=10;
        double b=5;
        double result= calculator.sub(a, b);
        Assert.assertEquals(5.0, result);
  }
  public void testMult() {
        Calculator calculator=new Calculator();
        double a=5;
        double b=5;
        double result=calculator.mult(a, b);
        Assert.assertEquals(25, result);
  }
  public void testDiv() {
        Calculator calculator=new Calculator();
        double a=5;
        double b=5;
        double result=calculator.div(a, b);
        Assert.assertEquals(1, result);
}
}