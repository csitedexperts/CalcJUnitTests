/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

	/*public CalculatorTest() {
    }


	/**
	 * Test of main method, of class Calculator.
	 */
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int a=5;
		int b=5;
		int result=c.add(a, b);
		Assert.assertEquals(10, result);
	}
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		int a=10;
		int b=5;
		int result=(int) c.sub(a, b);
		Assert.assertEquals(5, result);
	}
	@Test
	public void testModulo() {
		Calculator c = new Calculator();
		int a=10;
		int b=4;
		int result=(int) c.modulo(a, b);
		Assert.assertEquals(2, result);
	}
	
	public void testMult() {
		Calculator c = new Calculator();
		float a=5;
		float b=5;
		float result=c.mult(a, b);
		Assert.assertEquals(25, result);
	}
	public void testDiv() {
		Calculator c = new Calculator();
		float a=5;
		float b=5;
		float result=c.div(a, b);
		Assert.assertEquals(1, result);
	}
}