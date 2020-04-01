/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 8;
        int expResult = 40320;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
    }
    
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testCalculo2(){
        System.out.println("n < 0");
        int n = -4;
        int result = Factorial.calculo(n);
    }
    
    @Test(expected = java.lang.ArithmeticException.class)
    public void testCalculo3() {
        System.out.println("fact 0");
        int n = 20;
        int result = Factorial.calculo(n);
    }
}
